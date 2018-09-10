package br.edu.ifpb.praticas.entidade;

import java.sql.Date;
import java.sql.Timestamp;

public class Tarefa {

    private String nome;
    private Date data;
    private Timestamp hora;

    public Tarefa() {
    }

    public Tarefa(String nome, Date data, Timestamp hora) {
        this.nome = nome;
        this.data = data;
        this.hora = hora;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }
    public Timestamp getHora() { return hora;  }
    public void setHora(Timestamp hora) { this.hora = hora;  }

}
