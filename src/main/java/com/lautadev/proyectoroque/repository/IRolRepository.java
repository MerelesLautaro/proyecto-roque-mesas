package com.lautadev.proyectoroque.repository;

import com.lautadev.proyectoroque.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol,Long> {
    
}
