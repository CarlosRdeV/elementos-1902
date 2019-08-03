package org.unitec.elementos;

import org.springframework.data.annotation.Id;

public class Almacen {

    @Id
    private String idAlmacen;
    private String idArticulo;
    private Long cantidad;
    private String tienda;

    public Almacen(String idAlmacen, String idArticulo, Long cantidad, String tienda) {
        this.idAlmacen = idAlmacen;
        this.idArticulo = idArticulo;
        this.cantidad = cantidad;
        this.tienda = tienda;
    }

    public Almacen() {
    }

    @Override
    public String toString() {
        return "Almacen{" + "idAlmacen=" + idAlmacen + ", idArticulo=" + idArticulo + ", cantidad=" + cantidad + ", tienda=" + tienda + '}';
    }

    public String getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(String idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

 
    
}
