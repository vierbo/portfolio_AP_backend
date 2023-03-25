package com.portfolio.backend.service;

import com.portfolio.backend.entity.Social;
import com.portfolio.backend.repository.RSocial;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSocial {
    @Autowired 
public RSocial socialRepo;

    public List<Social> verSocials() {
        List<Social> listaSocials = socialRepo.findAll();
        return listaSocials;
    }
    public Social buscarSocial(Integer dni) {
	//si no encuentra a la persona devuelve nulo.
        Social red = socialRepo.findById(dni).orElse(null);
        return red;
    }
    public void crearSocial(Social red) {
        socialRepo.save(red);
    }
    public void editarSocial(Social red) {
        socialRepo.save(red);
    }
    public void borrarSocial(Integer dni) {
        socialRepo.deleteById(dni);
    }
    
}
