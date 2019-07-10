
package org.unitec.elementos;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepoCliente extends MongoRepository<Cliente, Long> {
    
}
