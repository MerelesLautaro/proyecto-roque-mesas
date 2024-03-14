package com.lautadev.proyectoroque.service;

import com.lautadev.proyectoroque.model.Propuesta;
import java.util.List;

public interface IPropuestaService {
    public void crearPropuesta(Propuesta propuesta);
    public List<Propuesta> traerPropuesta();
    public Propuesta findPropuesta(Long id);
    public void eliminarPropuesta(Long id);
    public void editarPropuesta(Propuesta propuesta);
}
