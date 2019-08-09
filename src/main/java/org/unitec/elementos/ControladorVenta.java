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
@RequestMapping("/api/venta")
@CrossOrigin
public class ControladorVenta {
        
    @Autowired
    RepoVenta repoVenta;

    //1.Guardar
    @PostMapping("/agregar")
    Estatus guardar(@RequestBody String json) throws Exception {
        ObjectMapper maper = new ObjectMapper();
        Venta v = maper.readValue(json, Venta.class);
        repoVenta.save(v);
        Estatus e = new Estatus("Venta Guardada", true);
        return e;
    }

    //2.Buscar todos
    @GetMapping("/buscartodos")
    List<Venta> buscarTodos() {
        return repoVenta.findAll();
    }

    //3. Buscar por id
    @GetMapping("/buscar/{id}")
    Venta buscarPorId(@PathVariable String id) {
        return repoVenta.findById(id).get();
    }

    //4. Actualizar
    @PutMapping("/actualizar/{id}")
    Estatus actualizar(@RequestBody String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Venta v = mapper.readValue(json, Venta.class);
        repoVenta.save(v);
        Estatus e = new Estatus("Venta Actualizado", true);
        return e;
    }

    //5. Borrar por ID
    @DeleteMapping("/borrar/{id}")
    Estatus borrar(@PathVariable String id) {
        repoVenta.deleteById(id);
        Estatus e = new Estatus("Venta Borrada", true);
        return e;
    } 
    
    //6. Buscar por Referencia Like
    @GetMapping("/buscar/reporte/{tienda}")
    List<Venta> buscarReferenciaLike(@PathVariable String tienda){
        return repoVenta.findByReferenciaLike(tienda);
    }
    
        //7. Buscar por Tipo
    @GetMapping("/buscar/tipo/{tipo}")
    List<Venta> buscarTipo(@PathVariable String tipo){
        return repoVenta.findByTipo(tipo);
    }
}
