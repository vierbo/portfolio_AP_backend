package com.portfolio.backend.repository;

import com.portfolio.backend.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkills extends JpaRepository <Skills, Integer>{
    
}
