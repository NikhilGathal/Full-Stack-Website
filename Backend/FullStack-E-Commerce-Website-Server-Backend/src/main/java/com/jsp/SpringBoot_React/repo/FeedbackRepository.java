package com.jsp.SpringBoot_React.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.SpringBoot_React.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
