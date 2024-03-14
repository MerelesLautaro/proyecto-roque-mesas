package com.lautadev.proyectoroque.repository;

import com.lautadev.proyectoroque.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRepository extends JpaRepository<Alumno,Long>{
    
}
