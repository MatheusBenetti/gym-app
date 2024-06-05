package com.totex.gymapp.repository;

import com.totex.gymapp.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
    Optional<Exercise> findExerciseByExerciseName(String exerciseName);
}
