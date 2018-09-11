package br.edu.ifpb.praticas.bd;

import java.sql.SQLException;
import java.sql.Statement;

public class Postgres {

    private Conexao conexao;
    private Statement statement;

    public Postgres() {
    }

    public void novaTarefa() throws SQLException {
        int cod = conexao.abrirConexao();
        if(cod == 1){ System.out.println("Conexão Iniciada!"); }
        conexao.fecharConexao();
    }
    /* public void editarTarefa() throws SQLException {
        statement = conexao.abrirConexao();
        conexao.fecharConexao();
    }
    public void excluirTarefa() throws SQLException {
        statement = conexao.abrirConexao();
        conexao.fecharConexao();
    } */

}
