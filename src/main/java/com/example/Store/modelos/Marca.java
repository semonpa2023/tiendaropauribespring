package com.example.Store.modelos;

import jakarta.persistence.*;

import java.awt.*;
import java.time.LocalDate;

@Entity
@Table(name = "marcas")

public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id",nullable = false)
    private Integer id;
    @Column(name="nombreMarca",nullable = false, length = 100)
    private String nombreMarca;//Obligatorio y maximo 50 caracteres
    @Column(name="nit",nullable = false)
    private String nit;//Obligatorio solo numeros y maximo 10
    @Column(name="anocreacion",nullable = false)
    private LocalDate anoCreacion;//Obligario
    @Column(name="cantidadProductos",nullable = false,length = 50)
    private String sedePrincipal;//No se valida

    public Marca() {
    }

    public Marca(Integer id, String nombreMarca, String nit, LocalDate anoCreacion, String sedePrincipal) {
        this.id = id;
        this.nombreMarca = nombreMarca;
        this.nit = nit;
        this.anoCreacion = anoCreacion;
        this.sedePrincipal = sedePrincipal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public LocalDate getAnoCreacion() {
        return anoCreacion;
    }

    public void setAnoCreacion(LocalDate anoCreacion) {
        this.anoCreacion = anoCreacion;
    }

    public String getSedePrincipal() {
        return sedePrincipal;
    }

    public void setSedePrincipal(String sedePrincipal) {
        this.sedePrincipal = sedePrincipal;
    }
}
