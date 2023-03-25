package com.portfolio.backend.service;

import com.portfolio.backend.entity.Education;
import com.portfolio.backend.repository.REducation;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducation {
    @Autowired 
public REducation educaRepo;

    public List<Education> verEduc() {
        List<Education> listaEduc = educaRepo.findAll();
        return listaEduc;
    }
    public Education buscarEduc(Integer dni) {
	//si no encuentra a la persona devuelve nulo.
        Education edu = educaRepo.findById(dni).orElse(null);
        return edu;
    }
    public void crearEduc(Education edu) {
        educaRepo.save(edu);
    }
    public void editarEduc(Education edu) {
        educaRepo.save(edu);
    }
    public void borrarEduc(Integer dni) {
        educaRepo.deleteById(dni);
    }
}
