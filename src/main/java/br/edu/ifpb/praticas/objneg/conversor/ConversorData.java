/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.objneg.conversor;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Lestat
 */
public class ConversorData {
    
    public LocalDate convert(Date data) {
        return data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    
    public Date convert(LocalDate data) {
        return Date.from(data.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }
    
}
