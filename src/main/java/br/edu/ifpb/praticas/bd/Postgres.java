package br.edu.ifpb.praticas.bd;

import br.edu.ifpb.praticas.interfaces.DAO;
import java.sql.SQLException;
import java.sql.Statement;

public class Postgres implements DAO{

    private Conexao conexao;
    private Statement statement;

    public Postgres() {
    }

    public void novaTarefa() throws SQLException {
        String sql = "";
        statement = conexao.abrirConexao();
//        statement.execute(sql);
        System.out.println("Tarefa realizada");
        if (statement != null) statement.close();
    }
    /* public void editarTarefa() throws SQLException {
        String sql = "";
        statement.execute(sql);
        conexao.fecharConexao();
    }
    public void excluirTarefa() throws SQLException {
        String sql = "";
        statement.execute(sql);
        conexao.fecharConexao();
    } */

}
