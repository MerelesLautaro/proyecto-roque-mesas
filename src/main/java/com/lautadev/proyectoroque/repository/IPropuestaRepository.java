package com.lautadev.proyectoroque.repository;

import com.lautadev.proyectoroque.model.Propuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPropuestaRepository extends JpaRepository<Propuesta,Long>{
    
}
