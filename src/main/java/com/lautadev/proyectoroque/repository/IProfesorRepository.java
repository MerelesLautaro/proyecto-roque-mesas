package com.lautadev.proyectoroque.repository;

import com.lautadev.proyectoroque.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfesorRepository extends JpaRepository<Profesor,Long>{
    
}
