package com.lautadev.proyectoroque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Alumno extends Persona{
    @OneToOne
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name="fk_propuesta")
    private Propuesta propuesta;
    @OneToMany(mappedBy="alumno")
    private List<Inscripcion> listaIncripciones;
    

    public Alumno() {
    }

    public Alumno(Usuario usuario, Propuesta propuesta, List<Inscripcion> listaIncripciones, Long id, String nombre, String apellido, String email, String dni, String telefono) {
        super(id, nombre, apellido, email, dni, telefono);
        this.usuario = usuario;
        this.propuesta = propuesta;
        this.listaIncripciones = listaIncripciones;
    }

    

    
    
    
}
