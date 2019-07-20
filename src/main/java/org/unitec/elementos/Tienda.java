package org.unitec.elementos;

import org.springframework.data.annotation.Id;


public class Tienda {
    
    @Id
    private String nombre;
    private String password;
    private String abreviacion;
    //Array de vendedores
    private String[] vendedores;

    public Tienda(String nombre, String password, String abreviacion, String[] vendedores) {
        this.nombre = nombre;
        this.password = password;
        this.abreviacion = abreviacion;
        this.vendedores = vendedores;
    }

    public Tienda() {
    }

    @Override
    public String toString() {
        return "Tienda{" + "nombre=" + nombre + ", password=" + password + ", abreviacion=" + abreviacion + ", vendedores=" + vendedores + '}';
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

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }

    public String[] getVendedores() {
        return vendedores;
    }

    public void setVendedores(String[] vendedores) {
        this.vendedores = vendedores;
    }
    
}
