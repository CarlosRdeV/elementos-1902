/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@RequestMapping("/api/almacen")
@CrossOrigin
public class ControladorAlmacen {
    
    @Autowired
    RepoAlmacen repoAlma;
    
    
    //1.Guardar
    @PostMapping("/agregar")
    Estatus guardar(@RequestBody String json) throws Exception {
        ObjectMapper maper = new ObjectMapper();
        Almacen a = maper.readValue(json, Almacen.class);
        repoAlma.save(a);
        Estatus e = new Estatus("Objeto en Almacen Guardado", true);
        return e;
    }

    //2.Buscar todos
    @GetMapping("/buscartodos")
    List<Almacen> buscarTodos() {
        return repoAlma.findAll();
    }

    //3. Buscar por id
    @GetMapping("/buscar/{id}")
    Almacen buscarPorId(@PathVariable String id) {
        return repoAlma.findById(id).get();
    }

    //4. Actualizar
    @PutMapping("/actualizar/{id}")
    Estatus actualizar(@RequestBody String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Almacen a = mapper.readValue(json, Almacen.class);
        repoAlma.save(a);
        Estatus e = new Estatus("Articulo en almacen Actualizado", true);
        return e;
    }

    //5. Borrar por ID
    @DeleteMapping("/borrar/{id}")
    Estatus borrar(@PathVariable String id){
        repoAlma.deleteById(id);
        Estatus e = new Estatus("Articulo en almacen Borrado", true);
        return e;
    }
    
    //6. Buscar por id
    @GetMapping("/buscarexistencia/{articulo}/{tienda}")
    List<Almacen> buscarAlmacen(@PathVariable String articulo,@PathVariable String tienda){
        return repoAlma.findById_articuloAndTienda(articulo,tienda);
    }
    
}
