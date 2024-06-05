package com.totex.gymapp.service;

import com.totex.gymapp.controller.dto.CreateExerciseDto;
import com.totex.gymapp.entity.Exercise;
import com.totex.gymapp.exception.ExerciseExistsException;
import com.totex.gymapp.repository.ExerciseRepository;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {
    private final ExerciseRepository exerciseRepository;

    public ExerciseService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    public Exercise createExercise(CreateExerciseDto dto) {
        var exercise = exerciseRepository.findExerciseByExerciseName(dto.exerciseName());

        if (exercise.isPresent()) {
            throw new ExerciseExistsException("Exercise already exists");
        }

        return exerciseRepository.save(dto.toExercise());
    }
}
