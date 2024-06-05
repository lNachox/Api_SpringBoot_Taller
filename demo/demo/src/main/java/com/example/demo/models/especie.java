package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEspecie;

    @Enumerated(EnumType.STRING)
    private NombreEspecie nombre;


    // Getters and setters
    public Long getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(Long idEspecie) {
        this.idEspecie = idEspecie;
    }

    public NombreEspecie getNombre() {
        return nombre;
    }

    public void setNombre(NombreEspecie nombre) {
        this.nombre = nombre;
    }
}
