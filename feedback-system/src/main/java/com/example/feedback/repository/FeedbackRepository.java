package com.example.feedback.repository;

import com.example.feedback.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    // JpaRepository provides: save(), findAll(), findById(), deleteById()
    // No extra code needed for basic CRUD
}