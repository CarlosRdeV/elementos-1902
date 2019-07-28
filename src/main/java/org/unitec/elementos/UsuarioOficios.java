/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import org.springframework.data.annotation.Id;


public class UsuarioOficios {
    
    @Id
    private String email;    
    private String nombre;
    private String password;
    private String oficio;
    private String direccion;
    private String telefono;
    private double lat;
    private double lon;

    public UsuarioOficios(String email, String nombre, String password, String oficio, String direccion, String telefono, double lat, double lon) {
        this.email = email;
        this.nombre = nombre;
        this.password = password;
        this.oficio = oficio;
        this.direccion = direccion;
        this.telefono = telefono;
        this.lat = lat;
        this.lon = lon;
    }

    public UsuarioOficios() {
    }

    @Override
    public String toString() {
        return "UsuarioOficios{" + "email=" + email + ", nombre=" + nombre + ", password=" + password + ", oficio=" + oficio + ", direccion=" + direccion + ", telefono=" + telefono + ", lat=" + lat + ", lon=" + lon + '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    
    
}

