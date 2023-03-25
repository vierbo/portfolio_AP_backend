package com.portfolio.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    private Integer dni;
    private String fname;
    private String sname;
    @Temporal(TemporalType.DATE)
    private Date birth;
    private String location;
    private String country;
    private String photo_url;
    private String email;
    private String phone; 
    
}