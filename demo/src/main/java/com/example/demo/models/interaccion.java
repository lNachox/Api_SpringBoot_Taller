package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "interaccion")
public class interaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInteraccion;

    @Column(length = 45)
    private String nombreInteraccion;

    private Integer limiteInteraccion;

    
    // Getters and setters
    public Long getIdInteraccion() {
        return idInteraccion;
    }

    public void setIdInteraccion(Long idInteraccion) {
        this.idInteraccion = idInteraccion;
    }

    public String getNombreInteraccion() {
        return nombreInteraccion;
    }

    public void setNombreInteraccion(String nombreInteraccion) {
        this.nombreInteraccion = nombreInteraccion;
    }

    public Integer getLimiteInteraccion() {
        return limiteInteraccion;
    }

    public void setLimiteInteraccion(Integer limiteInteraccion) {
        this.limiteInteraccion = limiteInteraccion;
    }
}
