package com.example.codeathon.repository;

import com.example.codeathon.domain.Lessons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LessonsRepository extends JpaRepository<Lessons, Integer> {
}
