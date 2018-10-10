
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.ValidatorException;
import javax.faces.application.FacesMessage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lestat
 */
@FacesValidator("validadorNome")
public class Validator implements javax.faces.validator.Validator<String>{

    
    public void validate(FacesContext fc, UIComponent uic, String t) throws ValidatorException {
        if(!t.equals("Julierme")) throw new ValidatorException(new FacesMessage("Não é o nome correto"));
    }
    
    
}
