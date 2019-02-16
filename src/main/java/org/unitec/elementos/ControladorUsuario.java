package org.unitec.elementos;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")//Implica que vamos a generar un JSON , Aplication Programming Interface
@CrossOrigin //Origenes cruzamos, Heroku hospeda el cerebro, Mlab la persistencia (base de datos),todo en diferentes servidores con cloters elasticos 
//Necesitamos el CrossOrigin para realizar aplicaciones distribuidas!
public class ControladorUsuario {
    
}
