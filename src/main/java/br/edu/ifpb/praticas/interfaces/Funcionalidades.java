/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.interfaces;

import br.edu.ifpb.praticas.entidade.Tarefa;
import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Lestat
 */
public interface Funcionalidades {
    
    public void cadastrarData(String nome, Date data, Timestamp hora, String descricao);
    public void cadastrar(String nome, String descricao);
    public void excluir(Tarefa tarefa);
    
}
