package com.portfolio.backend.controller;

import com.portfolio.backend.entity.Education;
import com.portfolio.backend.service.SEducation;
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
@RequestMapping("education") //localhost:8080/social
@CrossOrigin(origins = "http://localhost:4200") //es la direccion del index de Angular
public class CEducation {
    @Autowired
    SEducation educaServ;
    //Creo que este Endpoint se puede eliminar porque es 1 to 1.
    @GetMapping("/lista")
    @ResponseBody
    public List <Education> verEduc(){
        return educaServ.verEduc();
    }
    @GetMapping("/ver/{dni}")
    @ResponseBody
    public Education buscarEduc(@PathVariable Integer dni){
        return educaServ.buscarEduc(dni);
    }
    @PostMapping ("/crear")
    public String crearEduc (@RequestBody Education edu){
        educaServ.crearEduc(edu);
        return "La formación fue creada correctamente";
    }
        @PostMapping ("/editar")
    public String editarEduc (@RequestBody Education edu){
        educaServ.editarEduc(edu);
        return "La formación fue actualizada correctamente.";
    }
        @DeleteMapping ("/borrar/{dni}")
    public String borrarEduc (@PathVariable Integer dni){
        educaServ.borrarEduc(dni);
        return "La formación fue eliminada";
    }
}
