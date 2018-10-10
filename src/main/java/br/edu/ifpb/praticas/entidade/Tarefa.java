package br.edu.ifpb.praticas.entidade;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Random;

public class Tarefa {

    private int id;
    private String nome;
    private Date data;
    private Timestamp hora;
    private String descricao;

    public Tarefa() {
    }

    public Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    
    /*public Tarefa(String nome, Date data, Timestamp hora, String descricao) {
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
    } */

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }
    public Timestamp getHora() { return hora;  }
    public void setHora(Timestamp hora) { this.hora = hora;  }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
   
    public int geraID(){
        int id = new Random().nextInt(5);
        return id;
    }
    
    @Override
    public String toString() {
        if (data != null) { return "Tarefa{" + "nome=" + nome + ", data=" + data + ", hora=" + hora + ", descricao=" + descricao + '}'; }
        return "Tarefa{" + "nome=" + nome + ", descricao=" + descricao + '}';
    }
     
}
