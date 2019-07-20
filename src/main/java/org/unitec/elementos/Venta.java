    
package org.unitec.elementos;

import org.springframework.data.annotation.Id;


public class Venta {
    
    @Id
    private Long id_venta;
    //AUTOINCREMENTAL
    private String id_articulo;
    //ID DE LA TABLA ARTICULO
    private int cantidad;
    //NO NEGATIVOS
    private String referencia;
    //LA REFERENCIA DEPENDERA DE LA FECHA Y TIENDA
    //V191407BCR01
    private String vendedor;
    //VENDEDOR ASIGNADO A LA TIENDA  

    public Venta(Long id_venta, String id_articulo, int cantidad, String referencia, String vendedor) {
        this.id_venta = id_venta;
        this.id_articulo = id_articulo;
        this.cantidad = cantidad;
        this.referencia = referencia;
        this.vendedor = vendedor;
    }

    public Venta() {
    }

    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + ", id_articulo=" + id_articulo + ", cantidad=" + cantidad + ", referencia=" + referencia + ", vendedor=" + vendedor + '}';
    }

    public Long getId_venta() {
        return id_venta;
    }

    public void setId_venta(Long id_venta) {
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

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    
    
}