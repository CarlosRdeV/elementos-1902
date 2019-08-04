/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import org.springframework.data.annotation.Id;


public class Surtir {
    //CAMBIAR EL NOMBRE Y TIPO A STRING
    @Id
    private String idSurtir;
    //ID_SURTIR AUTOINCREMENTAL
    private String idArticulo;
    //DEPENDE DEL ID DEL ARTICULO
    private int cantidad;
    //NO NEGATIVOS
    private String tienda;
    //NOMBRE COMPLETO DE LA TIENDA a donde se surte
    private String referencia;
    //REFERENCIA BASADO EN LA FECHA Y AUTOINCREMENTAL
    //S19140701

    public Surtir(String idSurtir, String idArticulo, int cantidad, String tienda, String referencia) {
        this.idSurtir = idSurtir;
        this.idArticulo = idArticulo;
        this.cantidad = cantidad;
        this.tienda = tienda;
        this.referencia = referencia;
    }

    public Surtir() {
    }

    @Override
    public String toString() {
        return "Surtir{" + "idSurtir=" + idSurtir + ", idArticulo=" + idArticulo + ", cantidad=" + cantidad + ", tienda=" + tienda + ", referencia=" + referencia + '}';
    }

    public String getIdSurtir() {
        return idSurtir;
    }

    public void setIdSurtir(String idSurtir) {
        this.idSurtir = idSurtir;
    }

    public String getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
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
