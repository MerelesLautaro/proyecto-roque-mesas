package com.lautadev.proyectoroque.repository;

import com.lautadev.proyectoroque.model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdministradorRepository extends JpaRepository<Administrador,Long> {
    
}
