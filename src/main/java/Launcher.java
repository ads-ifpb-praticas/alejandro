
import br.edu.ifpb.praticas.bd.Postgres;
import br.edu.ifpb.praticas.entidade.Tarefa;
import br.edu.ifpb.praticas.interfaces.DAO;
import br.edu.ifpb.praticas.interfaces.Funcionalidades;
import br.edu.ifpb.praticas.objneg.Controller;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lestat
 */
public class Launcher {
    public static void main (String [] args) throws SQLException{
        Funcionalidades func = new Controller();
        Tarefa tarefa = new Tarefa("ADS", "tarefa de casa");
        System.out.println(tarefa);
        func.cadastrar(tarefa.getNome(), tarefa.getDescricao());
        tarefa = new Tarefa("ADS", "");
        System.out.println(tarefa);
        func.cadastrar(tarefa.getNome(), tarefa.getDescricao());
        //DAO dao = new Postgres();
        //dao.novaTarefa(tarefa);
    }
}