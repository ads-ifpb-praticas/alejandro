/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.interfaces;

import java.sql.SQLException;

/**
 *
 * @author Lestat
 */
public interface DAO {
    
    public void novaTarefa() throws SQLException;
    /* public void editarTarefa() throws SQLException;
    public void excluirTarefa() throws SQLException;
    */
}
