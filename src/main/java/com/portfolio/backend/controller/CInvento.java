package com.portfolio.backend.controller;

import com.portfolio.backend.entity.Invento;
import com.portfolio.backend.service.SInvento;
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
@RequestMapping("proyecto") //localhost:8080/about
@CrossOrigin(origins = "http://localhost:4200") //es la direccion del index de Angular
public class CInvento {
            @Autowired
    SInvento proyeServ;
    //Creo que este Endpoint se puede eliminar porque es 1 to 1.
    @GetMapping("/lista")
    @ResponseBody
    public List <Invento> verProyecto(){
        return proyeServ.verProyecto();
    }
    @GetMapping("/ver/{dni}")
    @ResponseBody
    public Invento buscarProyecto(@PathVariable Integer dni){
        return proyeServ.buscarProyecto(dni);
    }
    @PostMapping ("/crear")
    public String crearProyecto (@RequestBody Invento invent){
        proyeServ.crearProyecto(invent);
        return "La descripción fue creada correctamente";
    }
        @PostMapping ("/editar")
    public String editarProyecto (@RequestBody Invento invent){
        proyeServ.editarProyecto(invent);
        return "La descripción fue actualizada correctamente.";
    }
        @DeleteMapping ("/borrar/{dni}")
    public String borrarProyecto (@PathVariable Integer dni){
        proyeServ.borrarProyecto(dni);
        return "La descripción fue eliminada";
    }
}
