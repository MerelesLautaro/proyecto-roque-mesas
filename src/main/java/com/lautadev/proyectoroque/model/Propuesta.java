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
public class Propuesta {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre_propuesta;
    @OneToMany(mappedBy="propuesta")
    private List<Alumno> listaAlumnos;

    public Propuesta() {
    }

    public Propuesta(Long id, String nombre_propuesta, List<Alumno> listaAlumnos) {
        this.id = id;
        this.nombre_propuesta = nombre_propuesta;
        this.listaAlumnos = listaAlumnos;
    }
    
    
}
