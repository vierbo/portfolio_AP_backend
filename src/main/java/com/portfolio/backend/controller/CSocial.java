package com.portfolio.backend.controller;

import com.portfolio.backend.entity.Social;
import com.portfolio.backend.service.SSocial;
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
@RequestMapping("social") //localhost:8080/social
@CrossOrigin(origins = "http://localhost:4200") //es la direccion del index de Angular
public class CSocial {
    @Autowired
    SSocial socialServ;
    //Creo que este Endpoint se puede eliminar porque es 1 to 1.
    @GetMapping("/lista")
    @ResponseBody
    public List <Social> verSocials(){
        return socialServ.verSocials();
    }
    @GetMapping("/ver/{dni}")
    @ResponseBody
    public Social buscarSocial(@PathVariable Integer dni){
        return socialServ.buscarSocial(dni);
    }
    @PostMapping ("/crear")
    public String crearSocial (@RequestBody Social redes){
        socialServ.crearSocial(redes);
        return "La descripción fue creada correctamente";
    }
        @PostMapping ("/editar")
    public String editarSocial (@RequestBody Social redes){
        socialServ.editarSocial(redes);
        return "La descripción fue actualizada correctamente.";
    }
        @DeleteMapping ("/borrar/{dni}")
    public String borrarSocial (@PathVariable Integer dni){
        socialServ.borrarSocial(dni);
        return "La descripción fue eliminada";
    }
}
