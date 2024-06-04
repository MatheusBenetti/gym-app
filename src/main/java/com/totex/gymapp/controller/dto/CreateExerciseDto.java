package com.totex.gymapp.controller.dto;

import com.totex.gymapp.entity.Exercise;

public record CreateExerciseDto(String exerciseName,
                                String description) {

    public Exercise toExercise() {
        return new Exercise(
                exerciseName,
                description
        );
    }
}
