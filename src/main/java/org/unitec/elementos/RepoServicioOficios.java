/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author CarlosRdeV
 */
public interface RepoServicioOficios extends MongoRepository<ServicioOficios,String>{
    
}