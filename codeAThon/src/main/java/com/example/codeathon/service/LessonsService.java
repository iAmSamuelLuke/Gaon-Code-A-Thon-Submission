package com.example.codeathon.service;

import com.example.codeathon.domain.Lessons;
import com.example.codeathon.domain.Users;
import com.example.codeathon.repository.LessonsRepository;
import com.example.codeathon.repository.UsersRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LessonsService {
    private final LessonsRepository lessonsRepository;
    private final UsersRepository usersRepository;

    @Transactional
    public Lessons display(String username){
        Users user;
        user = usersRepository.findById(username).orElseThrow(()-> new IllegalArgumentException("Check username"));
        Integer lesson_id = user.getLesson_id();

        Lessons lesson = lessonsRepository.findById(lesson_id).orElseThrow(()-> new IllegalArgumentException("no lesson id"));

        return lesson;
    }
}
