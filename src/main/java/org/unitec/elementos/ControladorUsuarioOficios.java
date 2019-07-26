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
@RequestMapping("/api/usuariooficios")
@CrossOrigin
public class ControladorUsuarioOficios {
          
    @Autowired
    RepoUsuarioOficios repoU;
    
      //1.Guardar
    @PostMapping("/agregar")
    Estatus guardar(@RequestBody String json) throws Exception {
        ObjectMapper maper = new ObjectMapper();
        UsuarioOficios u = maper.readValue(json, UsuarioOficios.class);
        repoU.save(u);
        Estatus e = new Estatus("Usuario Guardado", true);
        return e;
    }

    //2.Buscar todos
    @GetMapping("/buscartodos")
    List<UsuarioOficios> buscarTodos() {
        return repoU.findAll();
    }

    //3. Buscar por id
    @GetMapping("/buscar/{id}")
    UsuarioOficios buscarPorId(@PathVariable String id) {
        return repoU.findById(id).get();
    }

    //4. Actualizar
    @PutMapping("/actualizar/{id}")
    Estatus actualizar(@RequestBody String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        UsuarioOficios u = mapper.readValue(json, UsuarioOficios.class);
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

    //6. Buscar por Oficio
    @GetMapping("/buscar/oficio/{oficio}")
    List<UsuarioOficios> buscarPorUsuarioOficios(@PathVariable String oficio) {
        return repoU.findByOficio(oficio);
    }
}
