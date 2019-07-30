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
}
