package org.unitec.elementos;

import org.springframework.data.annotation.Id;

public class Almacen {

    @Id
    private String id_almacen;
    private String id_articulo;
    private Long cantidad;
    private String tienda;

    public Almacen(String id_almacen, String id_articulo, Long cantidad, String tienda) {
        this.id_almacen = id_almacen;
        this.id_articulo = id_articulo;
        this.cantidad = cantidad;
        this.tienda = tienda;
    }

    public Almacen() {
    }

    @Override
    public String toString() {
        return "Almacen{" + "id_almacen=" + id_almacen + ", id_articulo=" + id_articulo + ", cantidad=" + cantidad + ", tienda=" + tienda + '}';
    }

    public String getId_almacen() {
        return id_almacen;
    }

    public void setId_almacen(String id_almacen) {
        this.id_almacen = id_almacen;
    }

    public String getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(String id_articulo) {
        this.id_articulo = id_articulo;
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
