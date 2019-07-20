
package org.unitec.elementos;

import org.springframework.data.annotation.Id;


public class Transaccion {

    @Id
    private Long id_transaccion;
    private String tipo;
    private String tienda;
    private String fecha;
    private String referencia;

    public Transaccion(Long id_transaccion, String tipo, String tienda, String fecha, String referencia) {
        this.id_transaccion = id_transaccion;
        this.tipo = tipo;
        this.tienda = tienda;
        this.fecha = fecha;
        this.referencia = referencia;
    }

    public Transaccion() {
    }

    @Override
    public String toString() {
        return "Transaccion{" + "id_transaccion=" + id_transaccion + ", tipo=" + tipo + ", tienda=" + tienda + ", fecha=" + fecha + ", referencia=" + referencia + '}';
    }

    public Long getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(Long id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    
    
    
    
}
