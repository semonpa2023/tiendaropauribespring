package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Integer id;
    @Column(name="nombreproducto",nullable = false, length = 100)
    private String nombreProducto;
    @Column(name="referencia",nullable = false, length = 100)
    private String referencia;
    @Column(name="talla",nullable = false, length = 5)
    private String talla;
    @Column(name="cantidadbodega",nullable = false)
    private Integer cantidadBodega;
    @Column(name="preciounitario",nullable = false)
    private Integer precioUnitario;
    @Column(name="descripcion",nullable = false,length = 100)
    private String descripcion;
    @Column(name="fotografia",nullable = false, length = 255)
    private String fotografia;

    public Producto() {
    }

    public Producto(Integer id, String nombreProducto, String referencia, String talla, Integer cantidadBodega, Integer precioUnitario, String descripcion, String fotografia) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.referencia = referencia;
        this.talla = talla;
        this.cantidadBodega = cantidadBodega;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
    }
}
