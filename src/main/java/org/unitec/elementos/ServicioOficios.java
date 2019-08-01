package org.unitec.elementos;

import org.springframework.data.annotation.Id;


public class ServicioOficios {
    @Id
    private String id;    
    private String emailEmpleador;
    private String emailTrabajador;
    private String descripcion;
    private String fecha;
    private String hora;
    private String estatus;
    //En espera, En Proceso, Terminado, Cancelado

    public ServicioOficios(String id, String emailEmpleador, String emailTrabajador, String descripcion, String fecha, String hora, String estatus) {
        this.id = id;
        this.emailEmpleador = emailEmpleador;
        this.emailTrabajador = emailTrabajador;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.estatus = estatus;
    }

    public ServicioOficios() {
    }

    @Override
    public String toString() {
        return "ServicioOficios{" + "id=" + id + ", emailEmpleador=" + emailEmpleador + ", emailTrabajador=" + emailTrabajador + ", descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora + ", estatus=" + estatus + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmailEmpleador() {
        return emailEmpleador;
    }

    public void setEmailEmpleador(String emailEmpleador) {
        this.emailEmpleador = emailEmpleador;
    }

    public String getEmailTrabajador() {
        return emailTrabajador;
    }

    public void setEmailTrabajador(String emailTrabajador) {
        this.emailTrabajador = emailTrabajador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
    
}
