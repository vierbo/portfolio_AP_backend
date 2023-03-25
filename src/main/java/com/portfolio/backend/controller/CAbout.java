package com.portfolio.backend.controller;

import com.portfolio.backend.entity.About;
import com.portfolio.backend.service.SAbout;
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
@RequestMapping("about") //localhost:8080/about
@CrossOrigin(origins = "http://localhost:4200") //es la direccion del index de Angular
public class CAbout {
    @Autowired
    SAbout aboutServ;
    //Creo que este Endpoint se puede eliminar porque es 1 to 1.
    @GetMapping("/lista")
    @ResponseBody
    public List <About> verAbouts(){
        return aboutServ.verAbout();
    }
    @GetMapping("/ver/{dni}")
    @ResponseBody
    public About buscarAbout(@PathVariable Integer dni){
        return aboutServ.buscarAbout(dni);
    }
    @PostMapping ("/crear")
    public String crearAbout (@RequestBody About aboutme){
        aboutServ.crearAbout(aboutme);
        return "La descripción fue creada correctamente";
    }
        @PostMapping ("/editar")
    public String editarAbout (@RequestBody About aboutme){
        aboutServ.editarAbout(aboutme);
        return "La descripción fue actualizada correctamente.";
    }
        @DeleteMapping ("/borrar/{dni}")
    public String borrarAbout (@PathVariable Integer dni){
        aboutServ.borrarAbout(dni);
        return "La descripción fue eliminada";
    }
    
}
    

