package com.totex.gymapp.controller;

import com.totex.gymapp.controller.dto.CreateWorkoutDto;
import com.totex.gymapp.entity.Workout;
import com.totex.gymapp.service.WorkoutService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutController {
    private final WorkoutService workoutService;

    public WorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @PostMapping("/workouts")
    public ResponseEntity<Workout> createWorkout(@RequestBody CreateWorkoutDto dto) {
        var workout = workoutService.createWorkout(dto);
        return ResponseEntity.ok(workout);
    }
}
