/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.persistence;

import br.edu.ifpb.praticas.domain.Tarefa;
import java.util.List;
import javax.inject.Singleton;

import javax.persistence.EntityManager;

/**
 *
 * @author Lestat
 */

//@RepositorioTarefa
@Singleton
public class TarefaRepository {
    
//    @Inject
//    @PersistenceContext
    private EntityManager manager;
    private static TarefaRepository instance;
    public TarefaRepository(){}
    
    
    public void add(Tarefa t) {
        manager.getTransaction().begin();
        manager.persist(t);
        manager.getTransaction().commit();
    }

    public void remove(Tarefa t) {
        manager.getTransaction().begin();
        manager.remove(t);
        manager.getTransaction().commit();
    }

    public List<Tarefa> get() {
        return manager.createQuery("FROM Tarefa t ORDER BY t.nome").getResultList();
    }
    
}
