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
@RequestMapping("/api")//Implica que vamos a generar un JSON , Aplication Programming Interface
@CrossOrigin //Origenes cruzamos, Heroku hospeda el cerebro, Mlab la persistencia (base de datos),todo en diferentes servidores con cloters elasticos 
//Necesitamos el CrossOrigin para realizar aplicaciones distribuidas!
public class ControladorUsuario {

    @Autowired
    RepoUsuario repoU;

    //1. guardar :save()
    @PostMapping("/usuario")//Des
    Estatus guardar(@RequestBody String json) throws Exception {

        ObjectMapper maper = new ObjectMapper(); //Con esta clase des serializa
        Usuario u = maper.readValue(json, Usuario.class); //Le pasamos el json y lo tiene que transformar a un objeto de la clase usuario
        repoU.save(u);//Lo mandamos a guardar
        Estatus e = new Estatus("Usuario Guardado", true); //si se ejecuta correctamente esta es la respueta a enviar
        return e;//Este es el response, lo genera siempre el backend 
    }

    //2.Buscar todos
    @GetMapping("/usuario")
    List<Usuario> buscarTodos() {
        return repoU.findAll();
    }

    //3. Buscar por id
    @GetMapping("/usuario/{id}")
    Usuario buscarPorId(@PathVariable Integer id) {
        return repoU.findById(id).get();
    }

    //4. Actualizar
    @PutMapping("/usuario/")
    Estatus actualizar(@RequestBody String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Usuario u = mapper.readValue(json, Usuario.class);
        repoU.save(u);
        Estatus e = new Estatus("Actualizado", true);
        return e;
    }

    //5. Borrar por ID
    @DeleteMapping("/usuario/{id}")
    Estatus borrar(@PathVariable Integer id) {
        repoU.deleteById(id);
        Estatus e = new Estatus("Mensaje Borrado", true);
        return e;
    }
}
