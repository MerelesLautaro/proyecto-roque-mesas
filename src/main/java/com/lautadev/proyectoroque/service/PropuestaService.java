package com.lautadev.proyectoroque.service;

import com.lautadev.proyectoroque.model.Propuesta;
import com.lautadev.proyectoroque.repository.IPropuestaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropuestaService implements IPropuestaService {
    @Autowired
    private IPropuestaRepository propuRepo;
    
    @Override
    public void crearPropuesta(Propuesta propuesta) {
        propuRepo.save(propuesta);
    }

    @Override
    public List<Propuesta> traerPropuesta() {
        List<Propuesta> listaPropuestas = propuRepo.findAll();
        return listaPropuestas;
    }

    @Override
    public Propuesta findPropuesta(Long id) {
        Propuesta propuesta = propuRepo.findById(id).orElse(null);
        return propuesta;
    }

    @Override
    public void eliminarPropuesta(Long id) {
        propuRepo.deleteById(id);
    }

    @Override
    public void editarPropuesta(Propuesta propuesta) {
        this.crearPropuesta(propuesta);
    }
    
}
