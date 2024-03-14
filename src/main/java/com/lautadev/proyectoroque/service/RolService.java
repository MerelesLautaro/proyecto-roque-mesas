package com.lautadev.proyectoroque.service;

import com.lautadev.proyectoroque.model.Rol;
import com.lautadev.proyectoroque.repository.IRolRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService implements IRolService{
    @Autowired
    private IRolRepository rolRepo;
    
    @Override
    public void crearRol(Rol rol) {
        rolRepo.save(rol);
    }

    @Override
    public List<Rol> traerRol() {
        List<Rol> listaRoles = rolRepo.findAll();
        return listaRoles;
    }

    @Override
    public Rol findRol(Long id) {
        Rol rol = rolRepo.findById(id).orElse(null);
        return rol;
    }

    @Override
    public void eliminarRol(Long id) {
        rolRepo.deleteById(id);
    }

    @Override
    public void editarRol(Rol rol) {
        this.crearRol(rol);
    }
    
}
