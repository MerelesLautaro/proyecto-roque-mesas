package com.lautadev.proyectoroque.repository;

import com.lautadev.proyectoroque.model.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInscripcionRepository extends JpaRepository<Inscripcion,Long> {
    
}
