package org.unitec.elementos;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepoAlmacen extends MongoRepository<Almacen, String>{
    
        List<Almacen>findById_Articulo(String id_articulo);

    
   /*
    private String id_almacen;
    private String id_articulo;
    private Long cantidad;
    private String tienda;
    */
}
