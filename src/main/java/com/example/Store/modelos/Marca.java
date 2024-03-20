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
    private String nombreMarca;
    @Column(name="nit",nullable = false)
    private String nit;
    @Column(name="anocreacion",nullable = false)
    private LocalDate anoCreacion;
    @Column(name="cantidadProductos",nullable = false,length = 50)
    private String sedePrincipal;

    public Marca() {
    }

    public Marca(Integer id, String nombreMarca, String nit, LocalDate anoCreacion, String sedePrincipal) {
        this.id = id;
        this.nombreMarca = nombreMarca;
        this.nit = nit;
        this.anoCreacion = anoCreacion;
        this.sedePrincipal = sedePrincipal;
    }
}
