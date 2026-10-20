package com.praveennaik.question_service.model;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class QuestionWrapper {

    private int id;

    @Column(name = "question_title")
    private String questionTitle;

    private String option1;
    private String option2;
    private String option3;
    private String option4;
}
