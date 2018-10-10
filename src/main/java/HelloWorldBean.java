
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lestat
 */
@Named
@RequestScoped
public class HelloWorldBean implements Serializable {
    
    private String name = "Julierme";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void cadastrar(){
        
    }
        
}
