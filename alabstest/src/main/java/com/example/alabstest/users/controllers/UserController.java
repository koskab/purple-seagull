package com.example.alabstest.users.controllers;

import com.example.alabstest.users.dto.UserCreate;
import com.example.alabstest.users.dto.UserEditResponse;
import com.example.alabstest.users.dto.UserUpdate;
import com.example.alabstest.users.dto.UserView;
import com.example.alabstest.users.service.UserService;
import lombok.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    @PreAuthorize("isAuthenticated()")
    public UserView findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @PostMapping
    public UserEditResponse createUser(@RequestBody UserCreate user){
        return userService.create(user);
    }

    @PutMapping("/{id}")
    @PreAuthorize("isAuthenticated()")
    public UserEditResponse updateUser(@PathVariable Long id, @RequestBody UserUpdate user){
        return userService.update(id, user);
    }

    @DeleteMapping("{id}")
    @PreAuthorize("hasRole(ROLE_ADMIN)")
    public void deleteUser(@PathVariable Long id){
        userService.delete(id);
    }
}
