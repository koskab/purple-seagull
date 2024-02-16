package com.example.alabstest.users.service.impl;

import com.example.alabstest.users.dto.UserEditResponse;
import com.example.alabstest.users.dto.UserCreate;
import com.example.alabstest.users.dto.UserUpdate;
import com.example.alabstest.users.dto.UserView;
import com.example.alabstest.users.entity.User;
import com.example.alabstest.users.mapper.UserMapper;
import com.example.alabstest.users.repository.UserRepository;
import com.example.alabstest.users.service.UserService;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    @Override
    public UserView findById(Long id) {
        return UserMapper.INSTANCE.toView(getEntityById(id));
    }

    @Transactional(readOnly = true)
    @Override
    public User getEntityByEmail(String email){
        return userRepository.findByEmail(email).
                orElseThrow(() -> new RuntimeException("User with such email not found"));
    }

    @Transactional
    @Override
    public User getEntityById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Transactional
    @Override
    public UserEditResponse create(UserCreate userCreate) {
        if(getEntityByEmail(userCreate.getEmail()) == null) {
            if(userCreate.getPassword() == userCreate.getRePassword()) {
                User user = UserMapper.INSTANCE.toEntity(userCreate);
                Long id = userRepository.save(user).getId();
                return UserMapper.INSTANCE.toView(id);
            }
            throw new RuntimeException("Passwords don't match");
        }
        throw new RuntimeException("User with this email already exists");
    }

    @Transactional
    @Override
    public void delete(Long id) {
        if(getEntityById(id) != null){
            userRepository.deleteById(id);
            return;
        }
        throw new RuntimeException("User not found");
    }

    @Transactional
    @Override
    public UserEditResponse update(Long id, UserUpdate userUpdate) {
        if(getEntityById(id) != null) {
            if(userUpdate.getPassword() == userUpdate.getRePassword()) {
                User user = UserMapper.INSTANCE.toEntity(userUpdate);
                Long response = userRepository.save(user).getId();
                return UserMapper.INSTANCE.toView(response);
            }
            throw new RuntimeException("Passwords don't match");
        }
        throw new RuntimeException("User not found");
    }
}
