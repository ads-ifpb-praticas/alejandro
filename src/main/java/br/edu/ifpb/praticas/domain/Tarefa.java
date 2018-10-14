package br.edu.ifpb.praticas.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tarefa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tarefa_id")
    private int id;
    @Column(length = 100, nullable = false, unique = true)
    private String nome;
    @Temporal(TemporalType.DATE)
    private LocalDate data;
    @Column(length = 150)
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
   
    @Override
    public String toString() {
        return "Tarefa{" + "id=" + id + ", nome=" + nome + ", data=" + data + ", descricao=" + descricao + '}';
    }
    
}
