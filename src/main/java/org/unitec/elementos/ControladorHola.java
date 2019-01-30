
package org.unitec.elementos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//REST - REpresentational State Transfer
//https://www.ics.uci.edu/~fielding/pubs/dissertation/fielding_dissertation.pdf


@RestController //Adapta la clase para ser un servicio del tipo REST 
@RequestMapping("/")
public class ControladorHola {
    
  @GetMapping("/")//Se usa el metodo Get de HTTP, junto al RestController, visualiza el lugar donde va a se consumido y lo traduce por medio de un lenguaje comodin que son los JSON
  public String holaMundo(){
  
      return "Mi primer servicio REST :)";
  }
}
