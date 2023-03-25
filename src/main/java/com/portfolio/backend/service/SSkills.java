package com.portfolio.backend.service;

import com.portfolio.backend.entity.Skills;
import com.portfolio.backend.repository.RSkills;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSkills {
    @Autowired 
    public RSkills skillsRepo;
    
    //Trataría de reemplazar estos métodos con JOIN en Persona
    public List<Skills> verSkills() {
        List<Skills> listaSkills = skillsRepo.findAll();
        return listaSkills;
    }
    public Skills buscarSkills(Integer dni) {
	//si no encuentra a la persona devuelve nulo.
        Skills skill = skillsRepo.findById(dni).orElse(null);
        return skill;
    }
    public void crearSkills(Skills skill) {
        skillsRepo.save(skill);
    }
    public void editarSkills(Skills skill) {
        skillsRepo.save(skill);
    }
    public void borrarSkills(Integer dni) {
        skillsRepo.deleteById(dni);
    }
}
