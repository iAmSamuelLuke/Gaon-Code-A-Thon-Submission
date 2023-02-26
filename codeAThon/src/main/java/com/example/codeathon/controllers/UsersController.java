package com.example.codeathon.controllers;


import com.example.codeathon.domain.Users;
import com.example.codeathon.repository.UsersRepository;
import com.example.codeathon.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("users")
public class UsersController {
    private final UsersService usersService;
    private final UsersRepository usersRepository;

    @PostMapping("/setCoins")
    public ResponseEntity<?> setCoins(@RequestBody Users user) {
        return new ResponseEntity<>(usersService.setCoins(user), HttpStatus.ACCEPTED);
    }

    @GetMapping("/check1")
    public List<Users> retrieveUsers(){
        { return usersRepository.findAll(); }
    }

    @PostMapping("/create")
    public ResponseEntity<?> save(@RequestBody Users user){
        return new ResponseEntity<>(usersService.create(user), HttpStatus.CREATED);
    }

    @PostMapping("/setXP")
    public ResponseEntity<?> setXP(@RequestBody Users user) {
         return new ResponseEntity<>(usersService.setXP(user), HttpStatus.ACCEPTED);
        }


    }

