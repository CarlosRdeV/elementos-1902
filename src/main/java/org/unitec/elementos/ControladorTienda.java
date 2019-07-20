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
@RequestMapping("/api/tienda")
@CrossOrigin
public class ControladorTienda {
    
    @Autowired
    RepoTienda repoTienda;
    
      //1.Guardar
    @PostMapping("/agregar")
    Estatus guardar(@RequestBody String json) throws Exception {
        ObjectMapper maper = new ObjectMapper();
        Tienda t = maper.readValue(json, Tienda.class);
        repoTienda.save(t);
        Estatus e = new Estatus("Tienda Guardada", true);
        return e;
    }

    //2.Buscar todos
    @GetMapping("/buscartodos")
    List<Tienda> buscarTodos() {
        return repoTienda.findAll();
    }

    //3. Buscar por id
    @GetMapping("/buscar/{id}")
    Tienda buscarPorId(@PathVariable String id) {
        return repoTienda.findById(id).get();
    }

    //4. Actualizar
    @PutMapping("/actualizar/{id}")
    Estatus actualizar(@RequestBody String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Tienda t = mapper.readValue(json, Tienda.class);
        repoTienda.save(t);
        Estatus e = new Estatus("Tienda Actualizada", true);
        return e;
    }

    //5. Borrar por ID
    @DeleteMapping("/borrar/{id}")
    Estatus borrar(@PathVariable String id) {
        repoTienda.deleteById(id);
        Estatus e = new Estatus("Tienda Borrada", true);
        return e;
    }

}
