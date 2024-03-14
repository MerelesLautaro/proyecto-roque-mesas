package com.lautadev.proyectoroque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String dni;
    private String telefono;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String email, String dni, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
    }

    
    
    
}
