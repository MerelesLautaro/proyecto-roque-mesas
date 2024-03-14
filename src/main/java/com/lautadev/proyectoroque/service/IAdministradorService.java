package com.lautadev.proyectoroque.service;

import com.lautadev.proyectoroque.model.Administrador;
import java.util.List;

public interface IAdministradorService {
    public void crearAdmin(Administrador admin);
    public List<Administrador> traerAdmins();
    public Administrador findAdmin(Long id);
    public void eliminarAdmin(Long id);
    public void editarAdmin(Administrador admin);
    
}
