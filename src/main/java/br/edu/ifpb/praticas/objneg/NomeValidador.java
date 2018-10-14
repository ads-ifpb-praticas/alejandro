/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.objneg;

import java.time.LocalDate;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Lestat
 */
@FacesValidator("nomeValidador")
public class NomeValidador implements Validator {
    
    public void validate(FacesContext fc, UIComponent uic, Object t) throws ValidatorException {
        String nome = (String) t;
        if (nome == null || nome.isEmpty())
            throw new ValidatorException(new FacesMessage("Nao e permitido nome em branco"));
    }
    
}
