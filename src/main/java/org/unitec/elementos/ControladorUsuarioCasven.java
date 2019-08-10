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
 * @author CarlosRdeV
 */
@RestController
@RequestMapping("/api/usuariocasven")
@CrossOrigin
public class ControladorUsuarioCasven {
       
    @Autowired
    RepoUsuarioCasven repoU;
    
      //1.Guardar
    @PostMapping("/agregar")
    Estatus guardar(@RequestBody String json) throws Exception {
        ObjectMapper maper = new ObjectMapper();
        UsuarioCasven u = maper.readValue(json, UsuarioCasven.class);
        repoU.save(u);
        Estatus e = new Estatus("Usuario Guardado", true);
        return e;
    }

    //2.Buscar todos
    @GetMapping("/buscartodos")
    List<UsuarioCasven> buscarTodos() {
        return repoU.findAll();
    }

    //3. Buscar por id
    @GetMapping("/buscar/{id}")
    UsuarioCasven buscarPorId(@PathVariable String id) {
        return repoU.findById(id).get();
    }

    //4. Actualizar
    @PutMapping("/actualizar/{id}")
    Estatus actualizar(@RequestBody String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        UsuarioCasven u = mapper.readValue(json, UsuarioCasven.class);
        repoU.save(u);
        Estatus e = new Estatus("Usuario Actualizado", true);
        return e;
    }

    //5. Borrar por ID
    @DeleteMapping("/borrar/{id}")
    Estatus borrar(@PathVariable String id) {
        repoU.deleteById(id);
        Estatus e = new Estatus("Usuario Borrada", true);
        return e;
    }
    
        //7. Buscar por id_articulo y tienda
    @GetMapping("/buscar/{nombre}/{password}")
    List<UsuarioCasven> buscarPorNombreAndPassword(@PathVariable String nombre, @PathVariable String password){
        return repoU.findByNombreAndPassword(nombre, password);
    }

    
    
}
