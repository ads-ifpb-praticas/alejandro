/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.objneg;

import br.edu.ifpb.praticas.domain.Tarefa;
import br.edu.ifpb.praticas.qualifier.ServicoTarefa;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Lestat
 */
@Named("controller")
@RequestScoped
public class Controller {
    
    @Inject
    @ServicoTarefa
    private Service service;
    @Inject
    private Tarefa tarefa;
    
    public String cadastrar(Tarefa tarefa) {
       service.cadastrar(tarefa);
       return "index?faces-redirect=true";
    }

    public String excluir(Tarefa tarefa) {
        service.remover(tarefa);
        return "index?faces-redirect=true";
    }

    public List<Tarefa> listar() {
        return service.listar();      
    }
        
}
