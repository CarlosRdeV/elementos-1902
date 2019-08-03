package org.unitec.elementos;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepoAlmacen extends MongoRepository<Almacen, Long>{
    
    List<Almacen> findByArticuloTienda (String articulo, String tienda); 
    
    List<Almacen> findByArticulo(String articulo);
    
    List<Almacen> findByAlmacen(String almacen);
    List<Almacen> findByAlmacenAndArticulo(String almacen, String articulo);
}
