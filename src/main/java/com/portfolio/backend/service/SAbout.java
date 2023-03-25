package com.portfolio.backend.service;

import com.portfolio.backend.entity.About;
import com.portfolio.backend.repository.RAbout;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SAbout {
    @Autowired 
    public RAbout aboutRepo;
    
    //Trataría de reemplazar estos métodos con JOIN en Persona
    public List<About> verAbout() {
        List<About> listaAbouts = aboutRepo.findAll();
        return listaAbouts;
    }
    public About buscarAbout(Integer dni) {
	//si no encuentra a la persona devuelve nulo.
        About aboutme = aboutRepo.findById(dni).orElse(null);
        return aboutme;
    }
    public void crearAbout(About aboutme) {
        aboutRepo.save(aboutme);
    }
    public void editarAbout(About aboutme) {
        aboutRepo.save(aboutme);
    }
    public void borrarAbout(Integer dni) {
        aboutRepo.deleteById(dni);
    }
   
}
