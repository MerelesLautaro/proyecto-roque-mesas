package com.lautadev.proyectoroque.service;

import com.lautadev.proyectoroque.model.Administrador;
import com.lautadev.proyectoroque.repository.IAdministradorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorService implements IAdministradorService{
    @Autowired
    private IAdministradorRepository adminRepo;
    
    @Override
    public void crearAdmin(Administrador admin) {
        adminRepo.save(admin);
    }

    @Override
    public List<Administrador> traerAdmins() {
        List<Administrador> listaAdmins = adminRepo.findAll();
        return listaAdmins;
    }

    @Override
    public Administrador findAdmin(Long id) {
        Administrador admin = adminRepo.findById(id).orElse(null);
        return admin;
    }

    @Override
    public void eliminarAdmin(Long id) {
        adminRepo.deleteById(id);
    }

    @Override
    public void editarAdmin(Administrador admin) {
        this.crearAdmin(admin);
    }

    
}
