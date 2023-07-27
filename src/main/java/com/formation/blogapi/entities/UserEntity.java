package com.formation.blogapi.entities;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;
    
    @Transient
    private String passwordConfirm;

    @Column(length = 150, nullable = false, unique = true)
    private String email;

    @OneToOne
    private ProfileEntity profile;

    @OneToMany(mappedBy = "user")
    private Collection<PostEntity> posts;
    
}
