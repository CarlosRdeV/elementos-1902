
package org.unitec.elementos;

import org.springframework.data.annotation.Id;

/**
 *
 * @author CarlosRdeV
 */
public class Cliente {
    @Id
    private Long id;
    private String nombre;
    private Orden orden;
    private Localizacion localizacion;

    public Cliente(Long id, String nombre, Orden orden, Localizacion localizacion) {
        this.id = id;
        this.nombre = nombre;
        this.orden = orden;
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", orden=" + orden + ", localizacion=" + localizacion + '}';
    }

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }
    
    
}
