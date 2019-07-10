/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")//Implica que vamos a generar un JSON , Aplication Programming Interface
@CrossOrigin 
public class ControladorCliente {
    
    @Autowired
    RepoCliente repoC;
    
     @GetMapping("/cliente")
    List<Cliente> buscarTodos() {
       return repoC.findAll();
    }
}
