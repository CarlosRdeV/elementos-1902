
package org.unitec.elementos;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepoUsuario extends MongoRepository<Usuario, Integer> {
    
}
