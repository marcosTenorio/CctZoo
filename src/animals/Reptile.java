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
public class Reptile extends Animal{
    
    private String habitat;

    public Reptile(){

    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    
    @Override
    public String getProperties(){
        String output = " Natural habitat: " + this.habitat + "\n";
        return output;
    }
}
