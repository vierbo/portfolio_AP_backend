package com.portfolio.backend.controller;

import com.portfolio.backend.entity.Skills;
import com.portfolio.backend.service.SSkills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("skills") //localhost:8080/about
@CrossOrigin(origins = "http://localhost:4200") //es la direccion del index de Angular
public class CSkills {
    @Autowired
    SSkills skillServ;
    //Creo que este Endpoint se puede eliminar porque es 1 to 1.
    @GetMapping("/lista")
    @ResponseBody
    public List <Skills> verSkills(){
        return skillServ.verSkills();
    }
    @GetMapping("/ver/{dni}")
    @ResponseBody
    public Skills buscarSkills(@PathVariable Integer dni){
        return skillServ.buscarSkills(dni);
    }
    @PostMapping ("/crear")
    public String crearSkills (@RequestBody Skills skill){
        skillServ.crearSkills(skill);
        return "La descripción fue creada correctamente";
    }
        @PostMapping ("/editar")
    public String editarSkills (@RequestBody Skills skill){
        skillServ.editarSkills(skill);
        return "La descripción fue actualizada correctamente.";
    }
        @DeleteMapping ("/borrar/{dni}")
    public String borrarSkills (@PathVariable Integer dni){
        skillServ.borrarSkills(dni);
        return "La descripción fue eliminada";
    }
}
