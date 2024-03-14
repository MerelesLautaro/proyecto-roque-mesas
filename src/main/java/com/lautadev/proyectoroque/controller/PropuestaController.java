package com.lautadev.proyectoroque.controller;

import com.lautadev.proyectoroque.model.Propuesta;
import com.lautadev.proyectoroque.service.IPropuestaService;
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
public class PropuestaController {
    @Autowired
    private IPropuestaService propuServ;
    
    //Endpoints
    @PostMapping("/propuesta/crear")
    public String crearPropuesta(@RequestBody Propuesta propuesta){
        propuServ.crearPropuesta(propuesta);
        return "Propuesta creada";
    }
    
    @GetMapping("/propuesta")
    public List<Propuesta> traerPropuestas(){
        return propuServ.traerPropuesta();
    }
    
    @GetMapping("/propuesta/{id}")
    public Propuesta findPropuesta(@PathVariable Long id){
        return  propuServ.findPropuesta(id);
    }
    
    @DeleteMapping("/propuesta/eliminar/{id}")
    public void eliminarPropuesta(@PathVariable Long id){
        propuServ.eliminarPropuesta(id);
    }
    
    @PutMapping("/propuesta/editar")
    public Propuesta editarPropuesta(@RequestBody Propuesta propuesta){
        propuServ.editarPropuesta(propuesta);
        return propuServ.findPropuesta(propuesta.getId());
    }
}
