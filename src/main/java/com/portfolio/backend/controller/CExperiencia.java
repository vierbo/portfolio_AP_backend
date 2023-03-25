package com.portfolio.backend.controller;

import com.portfolio.backend.entity.Experiencia;
import com.portfolio.backend.service.SExperiencia;
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
@RequestMapping("experiencia") //localhost:8080/experiencia
@CrossOrigin(origins = "http://localhost:4200") //es la direccion del index de Angular
public class CExperiencia {
    @Autowired
    SExperiencia expeServ;
    //Creo que este Endpoint se puede eliminar porque es 1 to 1.
    @GetMapping("/lista")
    @ResponseBody
    public List <Experiencia> verExpe(){
        return expeServ.verExpe();
    }
    @GetMapping("/ver/{dni}")
    @ResponseBody
    public Experiencia buscarExpe(@PathVariable Integer dni){
        return expeServ.buscarExpe(dni);
    }
    @PostMapping ("/crear")
    public String crearExpe (@RequestBody Experiencia job){
        expeServ.crearExpe(job);
        return "La experiencia fue creada correctamente";
    }
        @PostMapping ("/editar")
    public String editarExpe (@RequestBody Experiencia job){
        expeServ.editarExpe(job);
        return "La formación fue actualizada correctamente.";
    }
        @DeleteMapping ("/borrar/{dni}")
    public String borrarExpe (@PathVariable Integer dni){
        expeServ.borrarExpe(dni);
        return "La formación fue eliminada";
    }
}
