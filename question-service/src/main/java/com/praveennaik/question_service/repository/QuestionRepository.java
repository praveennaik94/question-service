package com.praveennaik.question_service.repository;

import com.praveennaik.question_service.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findByCategory(String category);

    @Query(value = "SELECT q.id FROM questions q WHERE category = :category ORDER BY RANDOM() LIMIT :limit", nativeQuery = true)
    List<Integer> findRandomQuestionByCategory(String category, int limit);
}
