
package org.unitec.elementos;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepoServicioOficios extends MongoRepository<ServicioOficios,String>{
    
            List<ServicioOficios> findByEmailEmpleador(String emailEmpleador); 
            
            List<ServicioOficios> findByEmailTrabajador(String emailTrabajador);  
            
    
}
