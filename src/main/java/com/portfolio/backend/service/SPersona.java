package com.portfolio.backend.service;

import com.portfolio.backend.entity.Persona;
import com.portfolio.backend.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {

    @Autowired 
public RPersona personaRepo;

    public List<Persona> verPersonas() {
        List<Persona> listaPersonas = personaRepo.findAll();
        return listaPersonas;
    }
    public Persona buscarPersona(Integer dni) {
	//si no encuentra a la persona devuelve nulo.
        Persona perso = personaRepo.findById(dni).orElse(null);
        return perso;
    }
    public void crearPersona(Persona perso) {
        personaRepo.save(perso);
    }
    public void editarPersona(Persona perso) {
        personaRepo.save(perso);
    }
    public void borrarPersona(Integer dni) {
        personaRepo.deleteById(dni);
    }
}