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
    private String nombreProducto;//no vacio solo letras y espacios longitud 60
    @Column(name="referencia",nullable = false, length = 100)
    private String referencia;//no vacio  longitud 14
    @Column(name="talla",nullable = false, length = 5)
    private String talla;//maximo 3 caracteres
    @Column(name="cantidadbodega",nullable = false)
    private Integer cantidadBodega;//solo numeros positivos
    @Column(name="preciounitario",nullable = false)
    private Integer precioUnitario;//solo numeros positivos
    @Column(name="descripcion",nullable = false,length = 100)
    private String descripcion;//maximo 100 caracteres
    @Column(name="fotografia",nullable = false, length = 255)
    private String fotografia;// no vacio y maximo 255

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Integer getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(Integer cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public Integer getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Integer precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }
}
