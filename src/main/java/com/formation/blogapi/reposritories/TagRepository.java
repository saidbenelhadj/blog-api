package com.formation.blogapi.reposritories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.blogapi.entities.TagEntity;


@Repository
public interface TagRepository extends JpaRepository<TagEntity, Integer>{
    
}
