
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

/**
 *
 * @author CarlosRdeV
 */
@RestController
@RequestMapping("/api/surtir")
@CrossOrigin
public class ControladorSurtir {       
    
    @Autowired
    RepoSurtir repoSur;

    //1.Guardar
    @PostMapping("/agregar")
    Estatus guardar(@RequestBody String json) throws Exception {
        ObjectMapper maper = new ObjectMapper();
        Surtir s = maper.readValue(json, Surtir.class);
        repoSur.save(s);
        Estatus e = new Estatus("Surtido Realizado", true);
        return e;
    }

    //2.Buscar todos
    @GetMapping("/buscartodos")
    List<Surtir> buscarTodos() {
        return repoSur.findAll();
    }

    //3. Buscar por id
    @GetMapping("/buscar/{id}")
    Surtir buscarPorId(@PathVariable Long id) {
        return repoSur.findById(id).get();
    }

    //4. Actualizar
    @PutMapping("/actualizar/{id}")
    Estatus actualizar(@RequestBody String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Surtir s = mapper.readValue(json, Surtir.class);
        repoSur.save(s);
        Estatus e = new Estatus("Surtido Actualizado", true);
        return e;
    }

    //5. Borrar por ID
    @DeleteMapping("/borrar/{id}")
    Estatus borrar(@PathVariable Long id) {
        repoSur.deleteById(id);
        Estatus e = new Estatus("Surtido Borrado", true);
        return e;
    }
     
}
