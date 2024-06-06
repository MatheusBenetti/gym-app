package com.totex.gymapp.controller.dto;

import com.totex.gymapp.entity.User;

public record CreateUserDto(String fullName,
                            String email,
                            String password,
                            String objective,
                            String phoneNumber,
                            float height,
                            float weight) {

    public User toUser() {
        return new User (
                fullName,
                email,
                password,
                objective,
                phoneNumber,
                height,
                weight
        );
    }

}

