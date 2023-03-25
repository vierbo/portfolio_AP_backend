package com.portfolio.backend.service;

import com.portfolio.backend.entity.Invento;
import com.portfolio.backend.repository.RInvento;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SInvento {
    @Autowired 
    public RInvento inveRepo;
    
    //Trataría de reemplazar estos métodos con JOIN en Persona
    public List<Invento> verProyecto() {
        List<Invento> listaProyectos = inveRepo.findAll();
        return listaProyectos;
    }
    public Invento buscarProyecto(Integer dni) {
	//si no encuentra a la persona devuelve nulo.
        Invento invent = inveRepo.findById(dni).orElse(null);
        return invent;
    }
    public void crearProyecto(Invento invent) {
        inveRepo.save(invent);
    }
    public void editarProyecto(Invento invent) {
        inveRepo.save(invent);
    }
    public void borrarProyecto(Integer dni) {
        inveRepo.deleteById(dni);
    }
}
