package org.unitec.elementos;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")//Implica que vamos a generar un JSON , Aplication Programming Interface
@CrossOrigin //Origenes cruzamos, Heroku hospeda el cerebro, Mlab la persistencia (base de datos),todo en diferentes servidores con cloters elasticos 
//Necesitamos el CrossOrigin para realizar aplicaciones distribuidas!
public class ControladorUsuario {
    @Autowired RepoUsuario repoU;
    //1. guardar :save()
    @PostMapping("/usuario")
    Estatus guardar(@RequestBody String json) throws Exception{
    
        ObjectMapper maper=new ObjectMapper();
        Usuario u=maper.readValue(json, Usuario.class);
        repoU.save(u);
        Estatus e=new Estatus("Usuario Guardado", true);
        return e;
    }
}
