package com.totex.gymapp.service;

import com.totex.gymapp.controller.dto.CreateWorkoutDto;
import com.totex.gymapp.entity.Workout;
import com.totex.gymapp.exception.WorkoutExistsException;
import com.totex.gymapp.repository.WorkoutRepository;

public class WorkoutService {
    public final WorkoutRepository workoutRepository;

    public WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    public Workout createWorkout(CreateWorkoutDto dto) {
        var workout = workoutRepository.findWorkoutByName(dto.name());

        if (workout.isPresent()) {
            throw new WorkoutExistsException("Workout already exists");
        }

        return workoutRepository.save(dto.toWorkout());
    }

}
