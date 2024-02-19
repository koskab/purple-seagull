package com.example.alabstest.users.controllers;

import com.example.alabstest.core.security.LogoutService;
import com.example.alabstest.users.dto.*;
import com.example.alabstest.users.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final LogoutService logoutService;

    @PostMapping("/sign-in")
    public UserSignInResponse signIn(@RequestBody UserSignIn request) {
        return userService.authenticate(request);
    }

    @PostMapping("/logout")
    public void logout(HttpServletRequest request,
                       HttpServletResponse response, Authentication authentication) {
        logoutService.logout(request, response, authentication);
    }

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
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteUser(@PathVariable Long id){
        userService.delete(id);
    }

}
