package com.lautadev.proyectoroque.controller;

import com.lautadev.proyectoroque.model.Inscripcion;
import com.lautadev.proyectoroque.service.IInscripcionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InscripcionController {
    @Autowired
    private IInscripcionService inscripServ;
    
    //Endpoints
    @PostMapping("/inscripcion/crear")
    public String crearInscripcion(@RequestBody Inscripcion inscripcion){
        inscripServ.crearInscripcion(inscripcion);
        return "Inscripcion creada";
    }
    
    @GetMapping("/inscripcion")
    public List<Inscripcion> traerInscripciones(){
        return inscripServ.traerInscripcion();
    }
    
    @GetMapping("/inscripcion/{id}")
    public Inscripcion findInscripcion(@PathVariable Long id){
        return inscripServ.findInscripcion(id);
    }
    
    @DeleteMapping("/inscripcion/eliminar/{id}")
    public void eliminarInscripcion(@PathVariable Long id){
        inscripServ.eliminarInscripcion(id);
    }
    
    @PutMapping("/inscripcion/editar")
    public Inscripcion editarInscripcion(@RequestBody Inscripcion inscripcion){
        inscripServ.editarInscripcion(inscripcion);
        return inscripServ.findInscripcion(inscripcion.getId());
    }
}
