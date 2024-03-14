package com.lautadev.proyectoroque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre_rol;
    @OneToMany(mappedBy="rol")
    private List<Usuario> listaUsuarios;

    public Rol() {
    }

    public Rol(Long id, String nombre_rol) {
        this.id = id;
        this.nombre_rol = nombre_rol;
    }
    
    
    
}
