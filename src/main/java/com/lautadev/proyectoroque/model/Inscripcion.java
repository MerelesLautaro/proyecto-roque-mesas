package com.lautadev.proyectoroque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Inscripcion {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private LocalDate fecha_llamado;
    private String propuesta;
    private String nombre_materia;
    private String estado;

    @ManyToOne
    @JoinColumn(name="fk_mesa")
    private Mesa mesa;

    @ManyToOne
    @JoinColumn(name="fk_alumno")
    private Alumno alumno;

    public Inscripcion() {
    }

    public Inscripcion(LocalDate fecha_llamado, String propuesta, String nombre_materia, String estado, Mesa mesa, Alumno alumno) {
        this.fecha_llamado = fecha_llamado;
        this.propuesta = propuesta;
        this.nombre_materia = nombre_materia;
        this.estado = estado;
        this.mesa = mesa;
        this.alumno = alumno;
    }   
}
