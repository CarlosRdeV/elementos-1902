package org.unitec.elementos;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepoTransaccion extends MongoRepository<Transaccion,Long>{
    
}
