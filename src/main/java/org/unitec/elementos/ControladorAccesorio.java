package org.unitec.elementos;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin 
public class ControladorAccesorio {

 @Autowired
    RepoAccesorio repoAcce;
     
       //1. guardar :save()
    @PostMapping("/accesorio")//Describimos el metodo que vamos a usar POST en este caso y la variante en nuestra URI
    Estatus guardar(@RequestBody String json) throws Exception { //Declaramos un metodo que regresara un mensaje del tipo estatus, 
                                                                 //como vamos a solicitar informacion al usuario mediante un JSON usamos
                                                                 //@RequestBody en forma de String con el nombre json para reconocerlo

        ObjectMapper maper = new ObjectMapper(); //Con esta clase des serializa la informacion que recibimos de la parte del front end, es decir nuestro json
        Accesorio a = maper.readValue(json, Accesorio.class); //Le pasamos el json y lo tiene que transformar a un objeto de la clase usuario
        repoAcce.save(a);//Lo mandamos a guardar con el metodo por defecto 
        Estatus e = new Estatus("Usuario Guardado", true); //si se ejecuta correctamente esta es la respueta a enviar
        return e;//Este es el response, lo genera siempre el backend 
    }

    //2.Buscar todos
    @GetMapping("/accesorio")
    List<Accesorio> buscarTodos() {
        return repoAcce.findAll();
    }

    //3. Buscar por id
    @GetMapping("/accesorio/{id}")
    Accesorio buscarPorId(@PathVariable Long id) {
        return repoAcce.findById(id).get();
    }

    //4. Actualizar
    @PutMapping("/accesorio/")
    Estatus actualizar(@RequestBody String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Accesorio a = mapper.readValue(json, Accesorio.class);
        repoAcce.save(a);
        Estatus e = new Estatus("Accesorio Actualizado", true);
        return e;
    }

    //5. Borrar por ID
    @DeleteMapping("/accesorio/{id}")
    Estatus borrar(@PathVariable Long id) {
        repoAcce.deleteById(id);
        Estatus e = new Estatus("Accesorio Borrado", true);
        return e;
    }
    
        //6. Buscar por descripcion
    @GetMapping("/accesorio/descripcion/{descripcion}")
    List<Accesorio> buscarPorDescripcion(@PathVariable String nombre) {
        return repoAcce.findByDescripcion(nombre);
    }
    
    
 
}
