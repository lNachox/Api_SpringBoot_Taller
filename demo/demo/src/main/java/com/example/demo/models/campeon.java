package com.example.demo.models;

import org.w3c.dom.css.Counter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class campeon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCampeon;

    @Column(name = "tipo_ataque", nullable = false, length = 15)
    private String tipoAtaque;

    @Column(name = "vida_base", nullable = false)
    private Integer vidaBase;

    @Column(name = "mana_bool", nullable = false)
    private Boolean manaBool;

    @Column(name = "energia_bool", nullable = false)
    private Boolean energiaBool;

    @Column(name = "velocidad_ataque_base", nullable = false)
    private Float velocidadAtaqueBase;

    @Column(name = "velocidad_movimmiento_base", nullable = false)
    private Integer velocidadMovimientoBase;

    @Column(length = 70)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "nacionalidad_id_nacionalidad")
    private nacionalidad nacionalidad;

    @ManyToOne
    @JoinColumn(name = "especie_id_especie")
    private especie especie;

    @ManyToOne
    @JoinColumn(name = "counter_id_counter")
    private Counter counter;

    @ManyToOne
    @JoinColumn(name = "rival_id_rival")
    private rival rival;

    
    // Getters and setters
    public Long getIdCampeon() {
        return idCampeon;
    }

    public void setIdCampeon(Long idCampeon) {
        this.idCampeon = idCampeon;
    }

    public String getTipoAtaque() {
        return tipoAtaque;
    }

    public void setTipoAtaque(String tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
    }

    public Integer getVidaBase() {
        return vidaBase;
    }

    public void setVidaBase(Integer vidaBase) {
        this.vidaBase = vidaBase;
    }

    public Boolean getManaBool() {
        return manaBool;
    }

    public void setManaBool(Boolean manaBool) {
        this.manaBool = manaBool;
    }

    public Boolean getEnergiaBool() {
        return energiaBool;
    }

    public void setEnergiaBool(Boolean energiaBool) {
        this.energiaBool = energiaBool;
    }

    public Float getVelocidadAtaqueBase() {
        return velocidadAtaqueBase;
    }

    public void setVelocidadAtaqueBase(Float velocidadAtaqueBase) {
        this.velocidadAtaqueBase = velocidadAtaqueBase;
    }

    public Integer getVelocidadMovimientoBase() {
        return getVelocidadMovimientoBase();
    }

    public void setVelocidadMovimientoBase(Integer velocidadMovimientoBase) {
        this.velocidadMovimientoBase = velocidadMovimientoBase;
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

    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    public rival getRival() {
        return rival;
    }

    public void setRival(rival rival) {
        this.rival = rival;
    }
    
}
