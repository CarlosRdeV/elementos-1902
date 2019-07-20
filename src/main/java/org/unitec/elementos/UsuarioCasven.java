package org.unitec.elementos;

import org.springframework.data.annotation.Id;

public class UsuarioCasven {
    
    @Id
    private String nombre;
    private String password;
    //Tipo Tienda,Admin,Root
    private String tipo;
    private String abreviacion;
    //Array de vendedores
    private String[] vendedores;

    @Override
    public String toString() {
        return "UsuarioCasven{" + "nombre=" + nombre + ", password=" + password + ", tipo=" + tipo + ", abreviacion=" + abreviacion + ", vendedores=" + vendedores + '}';
    }

    public UsuarioCasven(String nombre, String password, String tipo, String abreviacion, String[] vendedores) {
        this.nombre = nombre;
        this.password = password;
        this.tipo = tipo;
        this.abreviacion = abreviacion;
        this.vendedores = vendedores;
    }

    public UsuarioCasven() {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
