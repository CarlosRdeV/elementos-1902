
package org.unitec.elementos;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepoEmpleado extends MongoRepository<Empleado, Integer> {
    
}
