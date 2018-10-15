/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.persistence;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Lestat
 */
@Named
@SessionScoped
public class EntityManagerProduces implements Serializable{
    
    private static EntityManager manager;
    
    @Produces
    public static EntityManager getEntityManager() {
        manager =  Persistence
                .createEntityManagerFactory("alejandro")
                .createEntityManager();
        return manager;
    }
    
}
