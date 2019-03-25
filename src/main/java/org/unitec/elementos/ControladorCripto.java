
package org.unitec.elementos;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/cripto")
public class ControladorCripto {
    
     @GetMapping("/encrypt/{texto}")//Encriptar
  public String encrypt(@PathVariable String texto){
       try {
            Cripto ct = new Cripto("254125484125410j"); //Llave privada
            String encdata = ct.encrypt(texto);
            return encdata;
        }catch (Exception ex){
            Logger.getLogger(Cripto.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
        
  }
   
   @GetMapping("/dencrypt/{texto}")//Desencriptar
  public String dencrypt(@PathVariable String texto){
      try {
            Cripto ct = new Cripto("254125484125410j"); //Llave privada
            String decdata = ct.dencrypt(texto);
            return decdata;

        }catch (Exception ex){
            Logger.getLogger(Cripto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
  }
    
}
