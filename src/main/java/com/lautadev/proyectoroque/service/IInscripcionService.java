package com.lautadev.proyectoroque.service;

import com.lautadev.proyectoroque.model.Inscripcion;
import java.util.List;

public interface IInscripcionService {
    public void crearInscripcion(Inscripcion inscripcion);
    public List<Inscripcion> traerInscripcion();
    public Inscripcion findInscripcion(Long id);
    public void eliminarInscripcion(Long id);
    public void editarInscripcion(Inscripcion inscripcion);
}
