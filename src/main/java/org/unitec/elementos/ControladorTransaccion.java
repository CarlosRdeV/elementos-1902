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
@RequestMapping("/api/transaccion")
@CrossOrigin
public class ControladorTransaccion {
    
    @Autowired
    RepoTransaccion repoTrans;

    //1.Guardar
    @PostMapping("/agregar")
    Estatus guardar(@RequestBody String json) throws Exception {
        ObjectMapper maper = new ObjectMapper();
        Transaccion t = maper.readValue(json, Transaccion.class);
        repoTrans.save(t);
        Estatus e = new Estatus("Transaccion Guardada", true);
        return e;
    }

    //2.Buscar todos
    @GetMapping("/buscartodos")
    List<Transaccion> buscarTodos() {
        return repoTrans.findAll();
    }

    //3. Buscar por id
    @GetMapping("/buscar/{id}")
    Transaccion buscarPorId(@PathVariable Long id) {
        return repoTrans.findById(id).get();
    }

    //4. Actualizar
    @PutMapping("/actualizar/{id}")
    Estatus actualizar(@RequestBody String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Transaccion t = mapper.readValue(json, Transaccion.class);
        repoTrans.save(t);
        Estatus e = new Estatus("Trasaccion Actualizada", true);
        return e;
    }

    //5. Borrar por ID
    @DeleteMapping("/borrar/{id}")
    Estatus borrar(@PathVariable Long id) {
        repoTrans.deleteById(id);
        Estatus e = new Estatus("Transaccion Borrado", true);
        return e;
    }
    
}
