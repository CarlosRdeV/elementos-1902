
package org.unitec.elementos;

import org.springframework.data.annotation.Id;

public class Celular {
    
    
    @Id
    private Long id;
    private String marca;
    private String modelo;
    private String imei;
    private Float precio;
    private String ubicacion;
    
    public Celular(Long id, String marca, String modelo, String imei, Float precio, String ubicacion) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.imei = imei;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    public Celular() {
    }
    
    @Override
    public String toString() {
        return "Celular{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", imei=" + imei + ", precio=" + precio + ", ubicacion=" + ubicacion + '}';
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

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    
    
}
