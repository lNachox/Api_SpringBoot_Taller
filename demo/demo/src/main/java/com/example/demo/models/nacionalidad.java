package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class nacionalidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNacionalidad;

    @Enumerated(EnumType.STRING)
    private NombreNacionalidad nombre;

    
    // Getters and setters
    public Long getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Long idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public NombreNacionalidad getNombre() {
        return nombre;
    }

    public void setNombre(NombreNacionalidad nombre) {
        this.nombre = nombre;
    }
}
