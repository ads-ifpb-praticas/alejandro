package br.edu.ifpb.praticas.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private String url = "postgresql://localhost:5432/alejandro";
    private String login = "postgres";
    private String senha = "avantasia";
    private Connection conexao;

    public int abrirConexao() throws SQLException {
        try {
            conexao = DriverManager.getConnection(url,login,senha);
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } return 0;
    }
    public void fecharConexao() throws SQLException {
        try {
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
