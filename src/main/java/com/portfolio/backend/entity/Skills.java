package com.portfolio.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private Integer dni;
    
    @Size(min =1, max = 45, message = "no cumple con la longitud.")
    private String skill;
    
    private Double score;
    
    @Size(min =1, max = 100, message = "no cumple con la longitud.")
    private String url_icon;
    
    @Size(min =1, max = 20, message = "no cumple con la longitud.")
    private String tag;
}
