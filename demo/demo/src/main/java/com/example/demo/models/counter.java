package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class counter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCounter;

    @Column(name = "nombre", nullable = false, length = 70)
    private String nombre;

    @Column(name = "porcentaje_victoria", nullable = false)
    private Float porcentajeVictoria;

    @Column(name = "porcentaje_derrota", nullable = false)
    private Float porcentajeDerrota;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nacionalidad_id_nacionalidad", nullable = false)
    private nacionalidad nacionalidadIdNacionalidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "especie_id_especie", nullable = false)
    private especie especieIdEspecie;


    // Getters and setters
    public Long getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(Long idCounter) {
        this.idCounter = idCounter;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPorcentajeVictoria() {
        return porcentajeVictoria;
    }

    public void setPorcentajeVictoria(Float porcentajeVictoria) {
        this.porcentajeVictoria = porcentajeVictoria;
    }

    public Float getPorcentajeDerrota() {
        return porcentajeDerrota;
    }

    public void setPorcentajeDerrota(Float porcentajeDerrota) {
        this.porcentajeDerrota = porcentajeDerrota;
    }

    public nacionalidad getNacionalidad() {
        return getNacionalidad();
    }

    public void setNacionalidad(nacionalidad nacionalidad) {
        this.nacionalidadIdNacionalidad = nacionalidad;
    }

    public especie getEspecie() {
        return getEspecie();
    }

    public void setEspecie(especie especie) {
        this.especieIdEspecie = especie;
    }
}
    

