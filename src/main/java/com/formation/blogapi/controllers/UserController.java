package com.formation.blogapi.controllers;

import com.formation.blogapi.entities.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("")
    public Collection<UserEntity> findAll() {
        return List.of(
                new UserEntity(1, "user1", "password1", "password1", "said@gmail.com", null)
        );
    }
}