/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 *
 * @author CarlosRdeV
 */
public interface RepoAccesorio extends MongoRepository<Accesorio, Long>{
         List<Accesorio> findByDescripcion(String nombre);
         
         /*
         https://carlosrdev1902.herokuapp.com/api/accesorio con post + json para agregar accesorio
         https://carlosrdev1902.herokuapp.com/api/accesorio con get para ver todos
         https://carlosrdev1902.herokuapp.com/api/accesorio/1 con get + id para ver solo uno
         https://carlosrdev1902.herokuapp.com/api/accesorio/ con put para actualizar, hay que volver a mandar toda la informacion del objeto,
         https://carlosrdev1902.herokuapp.com/api/celular/1 con delete + id para eliminar uno solo
         */
}
