package com.totex.gymapp.service;

import com.totex.gymapp.controller.dto.CreateUserDto;
import com.totex.gymapp.entity.User;
import com.totex.gymapp.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(CreateUserDto dto) {
        var user = userRepository.findUserByEmail(dto.email());

        if (user.isPresent()) {
            // TODO: create new exception class
            throw new RuntimeException("User already exists");
        }

        return userRepository.save(dto.toUser());
    }
}
