package com.portfolio.backend.repository;

import com.portfolio.backend.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducation extends JpaRepository <Education, Integer>{
}
