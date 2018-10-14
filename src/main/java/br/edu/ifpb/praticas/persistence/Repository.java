/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.persistence;

import java.util.List;

/**
 *
 * @author Lestat
 */
public interface Repository<T> {
    
    void add(T t);
    void remove(T t);
    List<T> get();
    
}
