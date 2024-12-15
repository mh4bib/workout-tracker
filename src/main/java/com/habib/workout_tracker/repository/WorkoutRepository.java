package com.habib.workout_tracker.repository;

import com.habib.workout_tracker.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
    List<Workout> findByUserIdOrderByScheduledDateDesc(Long userId);
    List<Workout> findByUserIdAndScheduledDateBetween(Long userId, LocalDateTime start, LocalDateTime end);
}
