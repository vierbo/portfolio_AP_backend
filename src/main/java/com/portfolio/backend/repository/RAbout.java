package com.portfolio.backend.repository;

import com.portfolio.backend.entity.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RAbout extends JpaRepository <About, Integer>{
    
}
