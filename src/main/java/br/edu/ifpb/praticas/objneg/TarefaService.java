/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.objneg;

import br.edu.ifpb.praticas.domain.Tarefa;
import br.edu.ifpb.praticas.persistence.TarefaRepository;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Lestat
 */
@RequestScoped
//@ServicoTarefa
public class TarefaService {

    public TarefaService() {
    
    }
    
    @Inject
    private TarefaRepository repository;

    public List<Tarefa> listar() {
        return repository.get();
    }

    public void cadastrar(Tarefa tarefa) {
        repository.add(tarefa);
    }

    public void remover(Tarefa tarefa) {
        repository.remove(tarefa);
    }
    
}
