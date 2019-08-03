package org.unitec.elementos;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepoAlmacen extends MongoRepository<Almacen, String>{
    
        List<Almacen>findByIdArticulo(String idArticulo);

        List<Almacen>findByIdArticuloAndTienda(String idArticulo, String tienda);
        
   /*
    private String id_almacen;
    private String id_articulo;
    private Long cantidad;
    private String tienda;
    */
}
