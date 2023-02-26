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
public class Users {

    @Id
    @Column(name="username")
    private String username;

    private String password;

    private Integer xp;

    private Integer lesson_id;
    private Integer q_number;

    private Integer coins;

}
