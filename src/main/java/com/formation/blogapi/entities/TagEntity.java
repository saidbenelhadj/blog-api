package com.formation.blogapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tag")
public class TagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false, unique = true)
    private String name;

    @ManyToMany(mappedBy = "tags")
    private Collection<PostEntity> posts;
}
