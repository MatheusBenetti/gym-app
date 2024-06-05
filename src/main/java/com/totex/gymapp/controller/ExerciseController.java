package com.totex.gymapp.controller;

import com.totex.gymapp.controller.dto.CreateExerciseDto;
import com.totex.gymapp.entity.Exercise;
import com.totex.gymapp.service.ExerciseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController {

    private final ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @PostMapping("/exercises")
    public ResponseEntity<Exercise> createExercise(@RequestBody CreateExerciseDto dto) {
        var exercise = exerciseService.createExercise(dto);
        return ResponseEntity.ok(exercise);
    }
}
