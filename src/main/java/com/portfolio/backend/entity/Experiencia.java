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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private Integer dni;
    
    @Size(min =1, max = 45, message = "no cumple con la longitud.")
    private String job;
    
    @Size(min =1, max = 45, message = "no cumple con la longitud.")
    private String workplace;
    
    @Size(min =1, max = 100, message = "no cumple con la longitud.")
    private String url_logo;
    
    @Size(min =1, max = 500, message = "no cumple con la longitud.")
    private String description;
    
    @Size(min =1, max = 45, message = "no cumple con la longitud.")
    private String location;
    
    @Size(min =1, max = 45, message = "no cumple con la longitud.")
    private String country;
    
    private Integer start;
    
    private Integer end;
    
    private Integer current;
    
    private String url;  
}
