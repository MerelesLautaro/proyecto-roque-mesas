package com.lautadev.proyectoroque.service;

import com.lautadev.proyectoroque.model.Alumno;
import java.util.List;

public interface IAlumnoService {
    public void crearAlumno(Alumno alumno);
    public List<Alumno> traerAlumno();
    public Alumno findAlumno(Long id);
    public void eliminarAlumno(Long id);
    public void editarAlumno(Alumno alumno);
    
}
