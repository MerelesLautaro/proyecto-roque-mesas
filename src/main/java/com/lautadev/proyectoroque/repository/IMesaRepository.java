package com.lautadev.proyectoroque.repository;

import com.lautadev.proyectoroque.model.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMesaRepository extends JpaRepository<Mesa,Long> {
    
}
