package com.example.alabstest.users.service.impl;

import com.example.alabstest.users.dto.UserIdView;
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
        return userRepository.findById(id)
                .map(UserMapper.INSTANCE::toView)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Transactional(readOnly = true)
    @Override
    public User getEntityById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Transactional
    @Override
    public UserIdView createUser(UserCreate userCreate) {
        return UserMapper.INSTANCE.toView(userRepository
                .save(UserMapper.INSTANCE.toEntity(userCreate))
                .getId());
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Transactional
    @Override
    public UserIdView updateUser(UserUpdate userUpdate) {
        return UserMapper.INSTANCE.toView(userRepository
                .save(UserMapper.INSTANCE.toEntity(userUpdate))
                .getId());
    }
}
