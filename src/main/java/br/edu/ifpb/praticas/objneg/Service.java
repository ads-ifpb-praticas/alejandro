/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.objneg;

import br.edu.ifpb.praticas.domain.Tarefa;
import br.edu.ifpb.praticas.interfaces.Funcionalidades;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Lestat
 */
@Named("service")
@RequestScoped
public class Service {
    
    private Tarefa tarefa;
    private Funcionalidades func;
    
    public String cadastrar(){
        func.cadastrar(tarefa);
        return "index.xhtml";
    }
    
    public String excluir(){
        func.excluir(tarefa);
        return "index.xhtml";
    }
    
    public String listar(){
        func.listar();
        return "index.xhtml";
    }

    /* Get e Set */
    public Tarefa getTarefa() { return tarefa; }
    public void setTarefa(Tarefa tarefa) { this.tarefa = tarefa; }
    
}
