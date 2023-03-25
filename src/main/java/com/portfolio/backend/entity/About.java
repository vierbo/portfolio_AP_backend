package com.portfolio.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class About {
    @Id
    private Integer dni;
    
    private String title;
    
    @Size(min =1, max = 500, message = "no cumple con la longitud.")
    private String description;
    
    @Size(min =1, max = 500, message = "no cumple con la longitud.")
    private String interest;
    
    @Size(min =1, max = 500, message = "no cumple con la longitud.")
    private String history;
    
    private String tag; 
    
}