package com.example.codeathon.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Lessons {

    @Id
    @Column(name="lesson_id")
    private Integer id;

    private String content;

    private Integer num_questions;

}
