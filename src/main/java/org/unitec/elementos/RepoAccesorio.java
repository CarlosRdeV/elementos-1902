/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 *
 * @author CarlosRdeV
 */
public interface RepoAccesorio extends MongoRepository<Accesorio, Long>{
         List<Accesorio> findByDescripcion(String nombre);
}
