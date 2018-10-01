package br.edu.ifpb.praticas.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

    private String url = "postgresql://localhost:5432/alejandro";
    private String login = "postgres";
    private String senha = "avantasia";
    private Connection conexao;

    public Statement abrirConexao() throws SQLException {
        conexao = DriverManager.getConnection(url,login,senha);
        System.out.println("Conexão realizada");
        return conexao.createStatement();
    }
    public void fecharConexao() throws SQLException {
        try {
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
