/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class Avian extends Animal{
    
    private boolean feathered;
    private String feathersColor;
    
    public Avian(){

    }
    
    public String getFeathersColor() {
        return feathersColor;
    }

    public void setFeathersColor(String feathersColor) {
        this.feathersColor = feathersColor;
    }

    public boolean isFeathered() {
        return feathered;
    }

    public void setFeathered(boolean feathered) {
        this.feathered = feathered;
    }
    
    @Override
    public String getProperties(){
        String output = " is feathered: " + this.feathered + "\n";
        output += " Feathers colour: " + this.feathersColor + "\n";
        return output;
    }
    
}
