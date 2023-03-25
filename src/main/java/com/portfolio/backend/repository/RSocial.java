package com.portfolio.backend.repository;

import com.portfolio.backend.entity.Social;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSocial extends JpaRepository <Social, Integer>{
    
}
