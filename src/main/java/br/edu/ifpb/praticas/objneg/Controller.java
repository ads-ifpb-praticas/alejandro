/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.objneg;

import br.edu.ifpb.praticas.domain.Tarefa;
import br.edu.ifpb.praticas.qualifier.ServicoTarefa;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Lestat
 */
@Named("controller")
@SessionScoped
public class Controller  implements Serializable{
    
    @Inject
    private TarefaService service;
    private Tarefa tarefa = new Tarefa();
    
    public String cadastrar() {
       service.cadastrar(tarefa);
       tarefa = new Tarefa();
       return "index?faces-redirect=true";
    }

    public String excluir() {
        service.remover(tarefa);
        tarefa = new Tarefa();
        return "index?faces-redirect=true";
    }

  public List<Tarefa> listarAll(){
      return service.listar();
              
  }
    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
        
}
