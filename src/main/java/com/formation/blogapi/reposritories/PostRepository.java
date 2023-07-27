package com.formation.blogapi.reposritories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.blogapi.entities.PostEntity;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Integer>{
    
}
