/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.persistence;

import javax.enterprise.inject.Produces;
import javax.persistence.Persistence;

/**
 *
 * @author Lestat
 */
public class EntityManagerProduces {
    
    private static EntityManagerProduces manager;
    
    @Produces
    public static EntityManagerProduces getEntityManager() {
        manager = (EntityManagerProduces) Persistence
                .createEntityManagerFactory("alejandro")
                .createEntityManager();
        return manager;
    }
    
}
