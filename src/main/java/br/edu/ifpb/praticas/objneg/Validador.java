/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.objneg;

import java.time.LocalDate;

/**
 *
 * @author Lestat
 */
public class Validador {
    
    public int dataRetroativa(LocalDate data) {
        if (LocalDate.now().compareTo(data) < 0) return 0;
        return 1;
    }
    
    public int nomeEmBranco(String nome) {
        if(nome.isEmpty()) { return 0; }
        return 1;
    }
    
    public int descricaoEmBranco(String descricao) {
        if(descricao.isEmpty()) { return 0; }
        return 1;
    }
    
}
