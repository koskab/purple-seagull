package com.example.alabstest.users.service;

import com.example.alabstest.users.dto.UserIdView;
import com.example.alabstest.users.dto.UserCreate;
import com.example.alabstest.users.dto.UserUpdate;
import com.example.alabstest.users.dto.UserView;
import com.example.alabstest.users.entity.User;

public interface UserService {

    UserView findById(Long id);

    User getEntityById(Long id);

    UserIdView createUser(UserCreate userCreate);

    void deleteUser(Long id);

    UserIdView updateUser(UserUpdate userUpdate);
}
