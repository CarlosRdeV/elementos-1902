package org.unitec.elementos;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepoAlmacen extends MongoRepository<Almacen, String>{
    
    Almacen findById_articuloAndTienda(String id_articulo, String tienda);   
}
