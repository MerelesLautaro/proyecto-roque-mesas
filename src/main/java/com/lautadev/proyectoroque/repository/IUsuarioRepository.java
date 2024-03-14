package com.lautadev.proyectoroque.repository;

import com.lautadev.proyectoroque.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Long>{
    
}
