package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rival")
public class rival {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRival;

    @Column(length = 75)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "nacionalidad_id_nacionalidad")
    private nacionalidad nacionalidad;

    @ManyToOne
    @JoinColumn(name = "especie_id_especie")
    private especie especie;

    
    // Getters and setters
    public Long getIdRival() {
        return idRival;
    }

    public void setIdRival(Long idRival) {
        this.idRival = idRival;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public especie getEspecie() {
        return especie;
    }

    public void setEspecie(especie especie) {
        this.especie = especie;
    }
}
