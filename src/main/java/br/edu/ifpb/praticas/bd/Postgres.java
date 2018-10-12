package br.edu.ifpb.praticas.bd;

import br.edu.ifpb.praticas.domain.Tarefa;
import br.edu.ifpb.praticas.interfaces.DAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

public class Postgres implements DAO{

    private Conexao conexao;

    public Postgres() {
    }

    public void novaTarefa(Tarefa tarefa) throws SQLException {
        String sql = "INSERT INTO Tarefa(id,nome,data,hora,descricao) VALUES (?,?,?,?,?)";
        try{
            PreparedStatement statement = conexao.abrirConexao().prepareStatement(sql);
            statement.setInt(1, tarefa.geraID());
            statement.setString(2, tarefa.getNome());
            statement.setDate(3, (java.sql.Date) Date.from(Instant.MIN));
            statement.setTimestamp(4, Timestamp.from(Instant.MIN));
            statement.setString(5, tarefa.getDescricao());
            statement.execute(sql);
            statement.close();
        } catch (SQLException e){
            throw new SQLException(e);
        }
        System.out.println("Tarefa realizada");
    }
    /* public void excluirTarefa(int id) throws SQLException {
        String sql = "DELETE FROM Tarefa WHERE id =" + id;
        statement.execute(sql);
        conexao.fecharConexao();
    } */

}
