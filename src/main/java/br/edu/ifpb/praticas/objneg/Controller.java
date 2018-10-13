/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.objneg;

import br.edu.ifpb.praticas.domain.Tarefa;
import br.edu.ifpb.praticas.interfaces.Funcionalidades;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Lestat
 */
@Named("controller")
public class Controller implements Funcionalidades {
    
    ArrayList<Tarefa> tarefas = new ArrayList();
    private Validador validador;
    @Inject
    private Tarefa tarefa;
    
    public void cadastrarData(Tarefa tarefa) {
            int contador = 0;
            contador += validador.nomeEmBranco(tarefa.getNome());
            contador += validador.descricaoEmBranco(tarefa.getDescricao());
            contador += validador.dataRetroativa(tarefa.getData());
            if(contador == 3){
                tarefas.add(tarefa);
                System.out.println("Tarefa cadastrada");
            } else System.out.println("Dados inválidos");
    }
    
    public void cadastrar(Tarefa tarefa) {
        int contador = 0;
        contador += validador.nomeEmBranco(tarefa.getNome());
        contador += validador.descricaoEmBranco(tarefa.getDescricao());
        if(contador == 2){
                tarefas.add(tarefa);
                System.out.println("Tarefa cadastrada");
        } else System.out.println("Dados inválidos");
    }

    public void excluir(Tarefa tarefa) {
        tarefas.remove(this);
        System.out.println("Tarefa excluída");
    }

    public List<Tarefa> listar() {
        return tarefas;      
    }
        
}
