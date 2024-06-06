package com.totex.gymapp.controller;

import com.totex.gymapp.controller.dto.CreateUserDto;
import com.totex.gymapp.entity.User;
import com.totex.gymapp.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto dto) {
        var user = userService.createUser(dto);
        return ResponseEntity.ok(user);
    }
}
