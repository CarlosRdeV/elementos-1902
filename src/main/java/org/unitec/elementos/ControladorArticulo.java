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

/**
 *
 * Ticket https://catinfog.com/ticket-compra/
 * @author CarlosRdeV
 */
@RestController
@RequestMapping("/api/articulo")
@CrossOrigin
public class ControladorArticulo {

    @Autowired
    RepoArticulo repoArti;

    //1.Guardar
    @PostMapping("/agregar")
    Estatus guardar(@RequestBody String json) throws Exception {
        ObjectMapper maper = new ObjectMapper();
        Articulo a = maper.readValue(json, Articulo.class);
        repoArti.save(a);
        Estatus e = new Estatus("Articulo Guardado", true);
        return e;
    }

    //2.Buscar todos
    @GetMapping("/buscartodos")
    List<Articulo> buscarTodos() {
        return repoArti.findAll();
    }

    //3. Buscar por id
    @GetMapping("/buscar/{id}")
    Articulo buscarPorId(@PathVariable String id) {
        return repoArti.findById(id).get();
    }

    //4. Actualizar
    @PutMapping("/actualizar/{id}")
    Estatus actualizar(@RequestBody String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Articulo a = mapper.readValue(json, Articulo.class);
        repoArti.save(a);
        Estatus e = new Estatus("Articulo Actualizado", true);
        return e;
    }

    //5. Borrar por ID
    @DeleteMapping("/borrar/{id}")
    Estatus borrar(@PathVariable String id) {
        repoArti.deleteById(id);
        Estatus e = new Estatus("Articulo Borrado", true);
        return e;
    }
}
