package br.edu.ifpb.praticas.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tarefa implements Serializable {

    @Id
    private int id;
    private String nome;
    private LocalDate data;
    private String descricao;

    public Tarefa() {
    }

    public Tarefa(int id, String nome, LocalDate data, String descricao) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.descricao = descricao;
    }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
   
    public int geraID(){
        int id = new Random().nextInt(5);
        return id;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "id=" + id + ", nome=" + nome + ", data=" + data + ", descricao=" + descricao + '}';
    }
    
}
