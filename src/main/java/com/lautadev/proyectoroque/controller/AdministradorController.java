package com.lautadev.proyectoroque.controller;

import com.lautadev.proyectoroque.model.Administrador;
import com.lautadev.proyectoroque.service.IAdministradorService;
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
public class AdministradorController {
    @Autowired
    private IAdministradorService adminServ;
    
    //Endpoints
    @PostMapping("/admin/crear")
    public String crearAdmin(@RequestBody Administrador admin){
        adminServ.crearAdmin(admin);
        return "Admin creado";
    }
    
    @GetMapping("/admin")
    public List<Administrador> traerAdmins(){
        return adminServ.traerAdmins();
    }
    
    @GetMapping("/admin/{id}")
    public Administrador findAdmin(@PathVariable Long id){
        return adminServ.findAdmin(id);
    }
    
    @DeleteMapping("/admin/eliminar/{id}")
    public void eliminarAdmin(@PathVariable Long id){
        adminServ.eliminarAdmin(id);
    }
    
    @PutMapping("/admin/editar")
    public Administrador editarAdmin(@RequestBody Administrador admin){
        adminServ.editarAdmin(admin);
        return adminServ.findAdmin(admin.getId());
    }
}
