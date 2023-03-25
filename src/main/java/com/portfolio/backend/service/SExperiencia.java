package com.portfolio.backend.service;


import com.portfolio.backend.entity.Experiencia;
import com.portfolio.backend.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired 
public RExperiencia expeRepo;

    public List<Experiencia> verExpe() {
        List<Experiencia> listaExpe = expeRepo.findAll();
        return listaExpe;
    }
    public Experiencia buscarExpe(Integer dni) {
	//si no encuentra a la persona devuelve nulo.
        Experiencia job = expeRepo.findById(dni).orElse(null);
        return job;
    }
    public void crearExpe(Experiencia job) {
        expeRepo.save(job);
    }
    public void editarExpe(Experiencia job) {
        expeRepo.save(job);
    }
    public void borrarExpe(Integer dni) {
        expeRepo.deleteById(dni);
    }
}
