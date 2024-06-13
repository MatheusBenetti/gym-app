package com.totex.gymapp.controller.dto;

import com.totex.gymapp.entity.Workout;

public record CreateWorkoutDto(String name) {
    public Workout toWorkout() {
        return new Workout(name);
    }
}
