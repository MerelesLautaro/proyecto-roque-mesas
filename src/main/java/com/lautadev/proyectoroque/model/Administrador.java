package com.lautadev.proyectoroque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Administrador extends Persona {
    @OneToOne
    private Usuario usuario;

    public Administrador() {
    }

    public Administrador(Usuario usuario, Long id, String nombre, String apellido, String email, String dni, String telefono) {
        super(id, nombre, apellido, email, dni, telefono);
        this.usuario = usuario;
    }

    
    
    
}
