package com.lautadev.proyectoroque.service;

import com.lautadev.proyectoroque.model.Profesor;
import java.util.List;

public interface IProfesorService {
    public void crearProfesor(Profesor profesor);
    public List<Profesor> traerProfesor();
    public Profesor findProfesor(Long id);
    public void eliminarProfesor(Long id);
    public void editarProfesor(Profesor profesor);
}
