package com.formation.blogapi.entities;

import java.util.Collection;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "post")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false , unique = true)
    private String slug;

    @Column(columnDefinition = "LONGTEXT")
    private String content;

    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime datePosted;

    @ManyToOne
    private UserEntity user;

    @OneToMany(mappedBy = "post")
    private Collection<CommentEntity> comments;

    @ManyToMany
    private Collection<TagEntity> tags;
}
