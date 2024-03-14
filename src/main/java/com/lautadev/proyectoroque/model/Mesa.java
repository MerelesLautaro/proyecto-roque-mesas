package com.lautadev.proyectoroque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mesa {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre_materia;
    private LocalDate fecha_primer_llamado;
    private LocalDate fecha_segundo_llamado;
    private String presidente;
    private String primer_vocal;
    private String segundo_vocal;
    @ManyToMany
    private List<Propuesta> listaPropuestas;
    @ManyToMany
    private List<Profesor> listaProfesores;
    @OneToMany(mappedBy="mesa")
    private List<Inscripcion> listaIncripciones;

    public Mesa() {
    }

    public Mesa(Long id, String nombre_materia, LocalDate fecha_primer_llamado, LocalDate fecha_segundo_llamado, String presidente, String primer_vocal, String segundo_vocal, List<Propuesta> listaPropuestas, List<Profesor> listaProfesores, List<Inscripcion> listaIncripciones) {
        this.id = id;
        this.nombre_materia = nombre_materia;
        this.fecha_primer_llamado = fecha_primer_llamado;
        this.fecha_segundo_llamado = fecha_segundo_llamado;
        this.presidente = presidente;
        this.primer_vocal = primer_vocal;
        this.segundo_vocal = segundo_vocal;
        this.listaPropuestas = listaPropuestas;
        this.listaProfesores = listaProfesores;
        this.listaIncripciones = listaIncripciones;
    }

    
  
}
