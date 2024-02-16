package com.example.alabstest.users.service;

import com.example.alabstest.users.dto.*;
import com.example.alabstest.users.entity.User;

public interface UserService {

    UserSignInResponse authenticate(UserSignIn request);

    User getCurrentUser();

    UserView findById(Long id);

    User getEntityById(Long id);

    User getEntityByEmail(String email);

    UserEditResponse create(UserCreate userCreate);

    void delete(Long id);

    UserEditResponse update(Long id, UserUpdate userUpdate);

}
