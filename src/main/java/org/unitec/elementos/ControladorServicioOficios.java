
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
@RequestMapping("/api/serviciooficios")
@CrossOrigin
public class ControladorServicioOficios {
    
    @Autowired
    RepoServicioOficios repoSO;
    
      //1.Guardar
    @PostMapping("/agregar")
    Estatus guardar(@RequestBody String json) throws Exception {
        ObjectMapper maper = new ObjectMapper();
        ServicioOficios s = maper.readValue(json, ServicioOficios.class);
        repoSO.save(s);
        Estatus e = new Estatus("Servicio Guardado", true);
        return e;
    }

    //2.Buscar todos
    @GetMapping("/buscartodos")
    List<ServicioOficios> buscarTodos() {
        return repoSO.findAll();
    }

    //3. Buscar por id
    @GetMapping("/buscar/{id}")
    ServicioOficios buscarPorId(@PathVariable String id) {
        return repoSO.findById(id).get();
    }

    //4. Actualizar
    @PutMapping("/actualizar/{id}")
    Estatus actualizar(@RequestBody String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ServicioOficios s = mapper.readValue(json, ServicioOficios.class);
        repoSO.save(s);
        Estatus e = new Estatus("Servicio Actualizado", true);
        return e;
    }

    //5. Borrar por ID
    @DeleteMapping("/borrar/{id}")
    Estatus borrar(@PathVariable String id) {
        repoSO.deleteById(id);
        Estatus e = new Estatus("Servicio Borrada", true);
        return e;
    }
    
}