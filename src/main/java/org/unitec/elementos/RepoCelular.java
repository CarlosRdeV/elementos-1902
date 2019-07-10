
package org.unitec.elementos;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author CarlosRdeV
 */
public interface RepoCelular extends MongoRepository<Celular, Long>{
     List<Celular> findByModelo(String nombre);
     
     /*
     https://carlosrdev1902.herokuapp.com/api/celular
     
     http://localhost:8080/api/celular  con metodo GET para tener todo
     http://localhost:8080/api/celular con metodo post + json para agregar
     http://localhost:8080/api/celular/1 para obtener solo lo de 1
     http://localhost:8080/api/celular con PUT  para actualizar
     http://localhost:8080/api/celular/1 con metodo Delete para borrar 1
     
     
     https://carlosrdev1902.herokuapp.com/api/celular
     */
}
