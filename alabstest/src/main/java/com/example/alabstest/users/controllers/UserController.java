package com.example.alabstest.users.controllers;

import com.example.alabstest.users.dto.UserCreate;
import com.example.alabstest.users.dto.UserIdView;
import com.example.alabstest.users.dto.UserUpdate;
import com.example.alabstest.users.dto.UserView;
import com.example.alabstest.users.service.UserService;
import lombok.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@Getter
@Setter
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user/{id}")
    public UserView findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @PostMapping("/user/{user}")
    public UserIdView createUser(@PathVariable UserCreate user){
        return userService.createUser(user);
    }

    @PostMapping("/users/{user}")
    public UserIdView updateUser(@PathVariable UserUpdate user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    @PreAuthorize("hasRole(ROLE_ADMIN)")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

}
