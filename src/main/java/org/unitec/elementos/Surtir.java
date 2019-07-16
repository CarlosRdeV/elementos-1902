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
public class Surtir {
    
    @Id
    private Long id_surtir;
    //ID_SURTIR AUTOINCREMENTAL
    private String id_articulo;
    //DEPENDE DEL ID DEL ARTICULO
    private int cantidad;
    //NO NEGATIVOS
    private String tienda;
    //NOMBRE COMPLETO DE LA TIENDA a donde se surte
    private String referencia;
    //REFERENCIA BASADO EN LA FECHA Y AUTOINCREMENTAL
    //S19140701

    public Surtir(Long id_surtir, String id_articulo, int cantidad, String tienda, String referencia) {
        this.id_surtir = id_surtir;
        this.id_articulo = id_articulo;
        this.cantidad = cantidad;
        this.tienda = tienda;
        this.referencia = referencia;
    }

    public Surtir() {
    }

    @Override
    public String toString() {
        return "Surtir{" + "id_surtir=" + id_surtir + ", id_articulo=" + id_articulo + ", cantidad=" + cantidad + ", tienda=" + tienda + ", referencia=" + referencia + '}';
    }

    public Long getId_surtir() {
        return id_surtir;
    }

    public void setId_surtir(Long id_surtir) {
        this.id_surtir = id_surtir;
    }

    public String getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(String id_articulo) {
        this.id_articulo = id_articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    
}
