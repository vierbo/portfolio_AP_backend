package com.portfolio.backend.repository;

import com.portfolio.backend.entity.Invento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RInvento extends JpaRepository <Invento, Integer>{
    
}
