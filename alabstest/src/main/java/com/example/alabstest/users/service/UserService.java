package com.example.alabstest.users.service;

import com.example.alabstest.users.dto.UserEditResponse;
import com.example.alabstest.users.dto.UserCreate;
import com.example.alabstest.users.dto.UserUpdate;
import com.example.alabstest.users.dto.UserView;
import com.example.alabstest.users.entity.User;

public interface UserService {

    UserView findById(Long id);

    User getEntityById(Long id);

    User getEntityByEmail(String email);

    UserEditResponse create(UserCreate userCreate);

    void delete(Long id);

    UserEditResponse update(Long id, UserUpdate userUpdate);
}
