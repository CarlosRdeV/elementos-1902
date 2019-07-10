
package org.unitec.elementos;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author CarlosRdeV
 */
public interface RepoCelular extends MongoRepository<Celular, Long>{
     List<Usuario> findByModelo(String nombre);
}
