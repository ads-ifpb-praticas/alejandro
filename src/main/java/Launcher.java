
import br.edu.ifpb.praticas.bd.Postgres;
import br.edu.ifpb.praticas.domain.Tarefa;
import br.edu.ifpb.praticas.interfaces.DAO;
import br.edu.ifpb.praticas.interfaces.Funcionalidades;
import br.edu.ifpb.praticas.objneg.Controller;
import java.sql.SQLException;
import java.time.LocalDate;

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
        Tarefa tarefa = new Tarefa();
        Funcionalidades func = new Controller();
        tarefa.geraID();
        tarefa.setNome("ADS");
        tarefa.setDescricao("");
        tarefa.setData(LocalDate.now());
        System.out.println(tarefa);
        func.cadastrar(tarefa);
        tarefa = new Tarefa(2,"",LocalDate.now(),"tarefa de casa");
        System.out.println(tarefa);
        func.cadastrar(tarefa);
        //DAO dao = new Postgres();
        //dao.novaTarefa(tarefa);
    }
}