package com.portfolio.backend.controller;

import com.portfolio.backend.entity.Persona;
import com.portfolio.backend.service.SPersona;
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
@RequestMapping("persona") //localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200") //es la direccion del index de Angular
public class CPersona {
    @Autowired
    SPersona personaServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Persona> verPersonas(){
        return personaServ.verPersonas();
    }
    @GetMapping("/ver/{dni}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable Integer dni){
        return personaServ.buscarPersona(dni);
    }
    @PostMapping ("/crear")
    public String crearPersona (@RequestBody Persona pers){
        personaServ.crearPersona(pers);
        return "La persona fue creada correctamente";
    }
    @PostMapping ("/editar")
    public String editarPersona (@RequestBody Persona pers){
        personaServ.editarPersona(pers);
        return "La persona fue actualizada";
    }
    @DeleteMapping ("/borrar/{dni}")
    public String borrarPersona (@PathVariable Integer dni){
        personaServ.borrarPersona(dni);
        return "La persona fue eliminada";
    }
    
}