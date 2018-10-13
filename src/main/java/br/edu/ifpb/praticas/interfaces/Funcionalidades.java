/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.interfaces;

import br.edu.ifpb.praticas.domain.Tarefa;
import java.util.List;

/**
 *
 * @author Lestat
 */
public interface Funcionalidades {
    
    public void cadastrarData(Tarefa tarefa);
    public void cadastrar(Tarefa tarefa);
    public void excluir(Tarefa tarefa);
    public List<Tarefa> listar();
    
}
