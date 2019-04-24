package org.unitec.elementos;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Adapta la clase para ser un servicio del tipo REST 
@RequestMapping("/empleado")
@CrossOrigin
public class ControladorEmpleado {
    @Autowired
    RepoEmpleado repoE;
    
     @PostMapping("/guardar")
    Estatus guardar(@RequestBody String json) throws Exception { 
        ObjectMapper maper = new ObjectMapper(); 
        Empleado empleado= maper.readValue(json, Empleado.class); 
        repoE.save(empleado);
        Estatus e = new Estatus("Usuario Guardado", true); //si se ejecuta correctamente esta es la respueta a enviar
        return e;//Este es el response, lo genera siempre el backend 
    }
    
}
