/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import org.springframework.data.annotation.Id;

/**
 * 
 * @author CarlosRdeV
 */
public class Articulo {
    /*
    
    CELULARES
        @Id
    private Long id;
    private String marca;
    private String modelo;
    private String imei;
    private String titulo;
    private Float precio;
    private String ubicacion;
    
    ACCESORIOS
        @Id
    private Long id;
    private String marca;
    private String modelo;
    private String descripcion;
    private Float precio;
    private Integer cantidad;
    private String ubicacion;
    */
    
    //El id sera generado automaticamente basado en la fecha
    //Tipo de articulo y la serialización comienza apartir de eso
    //A19071401
    //C19071401
    @Id
    private String id;
    private String marca;
    private String modelo;
    private String imei;
    //El titulo será generado automaticamente basado 
    //en la marca, modelo y en el caso de celulares el imei
    private String titulo;
    private Float precio;
    //Accesorio o Celular
    private String tipo;

    public Articulo(String id, String marca, String modelo, String imei, String titulo, Float precio, String tipo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.imei = imei;
        this.titulo = titulo;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Articulo() {
    }

    @Override
    public String toString() {
        return "Articulo{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", imei=" + imei + ", titulo=" + titulo + ", precio=" + precio + ", tipo=" + tipo + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
