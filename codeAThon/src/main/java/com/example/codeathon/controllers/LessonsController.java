package com.example.codeathon.controllers;


import com.example.codeathon.domain.Lessons;
import com.example.codeathon.domain.Users;
import com.example.codeathon.repository.LessonsRepository;
import com.example.codeathon.service.LessonsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/lessons")
public class LessonsController {
    private final LessonsService lessonsService;
    private final LessonsRepository lessonsRepository;

    @GetMapping("/{username}/getLesson")
    public ResponseEntity<?> display(@PathVariable(value = "username") String username){
        return new ResponseEntity<>(lessonsService.display(username), HttpStatus.CREATED);
    }

    @GetMapping("/getAllLessons")
    public List<Lessons> getAllLessons() {
        return lessonsRepository.findAll();
    }
}
