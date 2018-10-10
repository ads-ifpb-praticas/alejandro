package br.edu.ifpb.praticas.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

    private String url = "jdbc:postgresql://localhost:5432/alejandro";
    private String login = "postgres";
    private String senha = "avantasia";
    private Connection conexao;

    public Connection abrirConexao() throws SQLException, NullPointerException {
        conexao = DriverManager.getConnection(url,login,senha);
        System.out.println("Conexão realizada");
        return conexao;
    }
    public void fecharConexao() throws SQLException, NullPointerException {
        try {
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
