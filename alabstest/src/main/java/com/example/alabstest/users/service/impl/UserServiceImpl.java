package com.example.alabstest.users.service.impl;

import com.example.alabstest.core.security.JwtService;
import com.example.alabstest.users.dto.*;
import com.example.alabstest.users.entity.User;
import com.example.alabstest.users.enums.Role;
import com.example.alabstest.users.mapper.UserMapper;
import com.example.alabstest.users.repository.UserRepository;
import com.example.alabstest.users.service.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @Transactional(readOnly = true)
    @Override
    public UserView findById(Long id) {
        if(getCurrentUser().getId() == id || getCurrentUser().getRole() == Role.ROLE_ADMIN)
            return UserMapper.INSTANCE.toView(getEntityById(id));
        throw new RuntimeException("Access denied");
    }

    @Transactional(readOnly = true)
    @Override
    public User getEntityByEmail(String email){
        return repository.findByEmail(email).
                orElseThrow(() -> new RuntimeException("User with such email not found"));
    }

    @Transactional(readOnly = true)
    @Override
    public User getEntityById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Transactional
    @Override
    public UserEditResponse create(UserCreate userCreate) {
        if(!repository.existsByEmail(userCreate.getEmail())) {
            if(userCreate.getPassword().equals(userCreate.getRePassword())) {
                userCreate.setPassword(passwordEncoder.encode(userCreate.getPassword()));
                User user = UserMapper.INSTANCE.toEntity(userCreate);
                user = repository.save(user);
                return new UserEditResponse(user.getId());
            }

            throw new RuntimeException("Passwords don't match");
        }

        throw new RuntimeException("User with this email already exists");
    }

    @Transactional
    @Override
    public void delete(Long id) {
        User user = getEntityById(id);
        if(user != null){
            user.setIsDeleted((byte) 1);
            repository.save(user);
            return;
        }
        throw new RuntimeException("User not found");
    }

    @Transactional
    @Override
    public UserEditResponse update(Long id, UserUpdate userUpdate) {
        if(getEntityById(id) != null) {
            if(userUpdate.getPassword().equals(userUpdate.getRePassword())) {
                userUpdate.setPassword(passwordEncoder.encode(userUpdate.getPassword()));
                User user = UserMapper.INSTANCE.toEntity(getEntityById(id), userUpdate);
                user = repository.save(user);
                return new UserEditResponse(user.getId());
            }
            throw new RuntimeException("Passwords don't match");
        }
        throw new RuntimeException("User not found");
    }

    @Transactional
    @Override
    public UserSignInResponse authenticate(UserSignIn request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = getEntityByEmail(request.getEmail());
        var jwtToken = jwtService.generateToken(user);
        var refreshToken = jwtService.generateRefreshToken(user);

        return UserSignInResponse.builder()
                .accessToken(jwtToken)
                .refreshToken(refreshToken)
                .build();
    }

    @Transactional(readOnly = true)
    @Override
    public User getCurrentUser() {
        var username = SecurityContextHolder.getContext().getAuthentication().getName();
        return getEntityByEmail(username);
    }

}
