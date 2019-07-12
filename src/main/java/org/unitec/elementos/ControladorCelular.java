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
@RequestMapping("/api")//Implica que vamos a generar un JSON , Aplication Programming Interface
@CrossOrigin 
public class ControladorCelular {
     @Autowired
    RepoCelular repoCel;
     
       //1. guardar :save()
    @PostMapping("/celular")//Describimos el metodo que vamos a usar POST en este caso y la variante en nuestra URI
    Estatus guardar(@RequestBody String json) throws Exception { //Declaramos un metodo que regresara un mensaje del tipo estatus, 
                                                                 //como vamos a solicitar informacion al usuario mediante un JSON usamos
                                                                 //@RequestBody en forma de String con el nombre json para reconocerlo

        ObjectMapper maper = new ObjectMapper(); //Con esta clase des serializa la informacion que recibimos de la parte del front end, es decir nuestro json
        Celular c = maper.readValue(json, Celular.class); //Le pasamos el json y lo tiene que transformar a un objeto de la clase usuario
        repoCel.save(c);//Lo mandamos a guardar con el metodo por defecto 
        Estatus e = new Estatus("Usuario Guardado", true); //si se ejecuta correctamente esta es la respueta a enviar
        return e;//Este es el response, lo genera siempre el backend 
    }

    //2.Buscar todos
    @GetMapping("/celular")
    List<Celular> buscarTodos() {
        return repoCel.findAll();
    }

    //3. Buscar por id
    @GetMapping("/celular/{id}")
    Celular buscarPorId(@PathVariable Long id) {
        return repoCel.findById(id).get();
    }

    //4. Actualizar
    @PutMapping("/celular/")
    Estatus actualizar(@RequestBody String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Celular c = mapper.readValue(json, Celular.class);
        repoCel.save(c);
        Estatus e = new Estatus("Actualizado", true);
        return e;
    }

    //5. Borrar por ID
    @DeleteMapping("/celular/{id}")
    Estatus borrar(@PathVariable Long id) {
        repoCel.deleteById(id);
        Estatus e = new Estatus("Mensaje Borrado", true);
        return e;
    }
    
    //NUEVO//
    /*       
    //Busqueda por Titulo
    List<Celular> findByTitulo (String titulo);
    */
        //6. Buscar por modelo
    @GetMapping("/celular/modelo/{modelo}")
    List<Celular> buscarPorModelo(@PathVariable String modelo) {
        return repoCel.findByModelo(modelo);
    }
        //7. Buscar por marca
    @GetMapping("/celular/marca/{marca}")
    List<Celular> buscarPorMarca(@PathVariable String marca) {
        return repoCel.findByMarca(marca);
    }
    
            //8. Buscar por ubicacion
    @GetMapping("/celular/ubicacion/{ubicacion}")
    List<Celular> buscarPorUbicacion(@PathVariable String ubicacion) {
        return repoCel.findByUbicacion(ubicacion);
    }
    
    //9. Buscar por Titulo
    @GetMapping("/celular/titulo/{titulo}")
    List<Celular> buscarPorTitulo(@PathVariable String titulo) {
        return repoCel.findByTitulo(titulo);
    }
        
}
