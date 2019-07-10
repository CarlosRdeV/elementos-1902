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
Id, Marca, Modelo, Precio, Cantidad, Ubicacion
*/
public class Accesorio {
    
    @Id
    private Long id;
    private String marca;
    private String modelo;
    private String descripcion;
    private Float precio;
    private Integer cantidad;
    private String ubicacion;

    public Accesorio() {
    }

    public Accesorio(Long id, String marca, String modelo, String descripcion, Float precio, Integer cantidad, String ubicacion) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Accesorio{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad=" + cantidad + ", ubicacion=" + ubicacion + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }     
}

