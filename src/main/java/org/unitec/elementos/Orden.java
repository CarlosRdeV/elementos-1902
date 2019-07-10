/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

/**
 *
 * @author CarlosRdeV
 */
public class Orden {
    private String nombreComida;
    private String nombreBebida;

    @Override
    public String toString() {
        return "Orden{" + "nombreComida=" + nombreComida + ", nombreBebida=" + nombreBebida + '}';
    }

    public Orden(String nombreComida, String nombreBebida) {
        this.nombreComida = nombreComida;
        this.nombreBebida = nombreBebida;
    }

    public Orden() {
    }

    public String getNombreComida() {
        return nombreComida;
    }

    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
    }

    public String getNombreBebida() {
        return nombreBebida;
    }

    public void setNombreBebida(String nombreBebida) {
        this.nombreBebida = nombreBebida;
    }
}
