/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.objneg;

import br.edu.ifpb.praticas.entidade.Tarefa;
import br.edu.ifpb.praticas.interfaces.Funcionalidades;
import java.sql.Date;
import java.sql.Timestamp;
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
    
    public void cadastrarData(String nome, Date data, Timestamp hora, String descricao) {
            int contador = 0;
            contador += validador.nomeEmBranco(nome);
            contador += validador.descricaoEmBranco(descricao);
            contador += validador.dataRetroativa(data);
            if(contador == 3){
                //tarefa = new Tarefa(nome, data, hora, descricao);
                System.out.println("Tarefa cadastrada");
            } else System.out.println("Dados inválidos");
    }
    
    public void cadastrar(String nome, String descricao) {
        int contador = 0;
        contador += validador.nomeEmBranco(nome);
        contador += validador.descricaoEmBranco(descricao);
        if(contador == 2){
                tarefa = new Tarefa(nome, descricao);
                System.out.println("Tarefa cadastrada");
        } else System.out.println("Dados inválidos");
    }

    public void excluir(Tarefa tarefa) {
        System.out.println("Tarefa excluída");
    }
        
}
