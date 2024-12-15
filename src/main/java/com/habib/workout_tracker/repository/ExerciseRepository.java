package com.habib.workout_tracker.repository;

import com.habib.workout_tracker.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
    List<Exercise> findByCategory(String category);
    List<Exercise> findByMuscleGroup(String muscleGroup);
}