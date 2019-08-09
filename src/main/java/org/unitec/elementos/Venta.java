    
package org.unitec.elementos;

import org.springframework.data.annotation.Id;


public class Venta {
    
    @Id
    private String id_venta;
    //AUTOINCREMENTAL
    private String id_articulo;
    //ID DE LA TABLA ARTICULO
    private int cantidad;
    //NO NEGATIVOS
    private String referencia;
    
    private String fecha;
    
    private String tipo;
    //LA REFERENCIA DEPENDERA DE LA FECHA Y TIENDA
    //V191407BCR01
    private String vendedor;
    //VENDEDOR ASIGNADO A LA TIENDA  
    private Double subtotal;

    public Venta(String id_venta, String id_articulo, int cantidad, String referencia, String fecha, String tipo, String vendedor, Double subtotal) {
        this.id_venta = id_venta;
        this.id_articulo = id_articulo;
        this.cantidad = cantidad;
        this.referencia = referencia;
        this.fecha = fecha;
        this.tipo = tipo;
        this.vendedor = vendedor;
        this.subtotal = subtotal;
    }

    public Venta() {
    }

    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + ", id_articulo=" + id_articulo + ", cantidad=" + cantidad + ", referencia=" + referencia + ", fecha=" + fecha + ", tipo=" + tipo + ", vendedor=" + vendedor + ", subtotal=" + subtotal + '}';
    }

    public String getId_venta() {
        return id_venta;
    }

    public void setId_venta(String id_venta) {
        this.id_venta = id_venta;
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

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    
    
}
