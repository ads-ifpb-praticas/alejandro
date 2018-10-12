/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.objneg;

import br.edu.ifpb.praticas.domain.Tarefa;
import br.edu.ifpb.praticas.interfaces.Funcionalidades;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Lestat
 */
@Named("controller")
public class Controller implements Funcionalidades {
    
    private Validador validador;
    @Inject
    private Tarefa tarefa;
    
    public void cadastrarData(Tarefa tarefa) {
            int contador = 0;
            contador += validador.nomeEmBranco(tarefa.getNome());
            contador += validador.descricaoEmBranco(tarefa.getDescricao());
            contador += validador.dataRetroativa(tarefa.getData());
            if(contador == 3){
                System.out.println("Tarefa cadastrada");
            } else System.out.println("Dados inv�lidos");
    }
    
    public void cadastrar(Tarefa tarefa) {
        int contador = 0;
        contador += validador.nomeEmBranco(tarefa.getNome());
        contador += validador.descricaoEmBranco(tarefa.getDescricao());
        if(contador == 2){
                System.out.println("Tarefa cadastrada");
        } else System.out.println("Dados inv�lidos");
    }

    public void excluir(Tarefa tarefa) {
        System.out.println("Tarefa exclu�da");
    }
        
}
