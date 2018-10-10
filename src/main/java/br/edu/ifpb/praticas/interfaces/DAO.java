/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.interfaces;

import br.edu.ifpb.praticas.entidade.Tarefa;
import java.sql.SQLException;

/**
 *
 * @author Lestat
 */
public interface DAO {
    
    public void novaTarefa(Tarefa tarefa) throws SQLException;
    /* public List<Tarefa> todasTarefas() throws SQLException;
    public void excluirTarefa(int id) throws SQLException;
    */
    
}
