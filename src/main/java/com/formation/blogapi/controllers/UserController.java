package com.formation.blogapi.controllers;

import com.formation.blogapi.entities.UserEntity;
import com.formation.blogapi.reposritories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("")
    public Collection<UserEntity> findAll() {
        return userRepository.findAll();
    }
    @PostMapping("")
    public void create(@RequestBody UserEntity user){
       userRepository.save(user);
    }
    
}