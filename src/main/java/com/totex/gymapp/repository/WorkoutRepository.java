package com.totex.gymapp.repository;

import com.totex.gymapp.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
    Optional<Workout> findWorkoutByName(String name);
}
