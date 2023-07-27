package com.formation.blogapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    private Integer id;
    private String username;
    private String password;
    private String passwordConfirm;
    private String email;


    
}
