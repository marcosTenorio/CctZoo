/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import java.util.Random;
import setuphelper.StoredDataUtility;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class Reptile extends Animal{
    
    private String habitat;
    
    Random r = new Random();
    
    /**
     *
     */
    public StoredDataUtility sDU = new StoredDataUtility();

    /**
     *
     */
    public Reptile(){
        this.setHabitat(sDU.habitat[r.nextInt(sDU.habitat.length)]);
    }

    /**
     *
     * @return
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     *
     * @param habitat
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getProperties(){
        String output = " Natural habitat: " + this.habitat + "\n";
        return output;
    }
}
