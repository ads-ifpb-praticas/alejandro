/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.objneg;

import br.edu.ifpb.praticas.domain.Tarefa;
import java.util.List;

/**
 *
 * @author Lestat
 */
public interface Service {
    
    List<Tarefa> listar();
    void cadastrar(Tarefa tarefa);
    void remover(Tarefa tarefa);
    
}
