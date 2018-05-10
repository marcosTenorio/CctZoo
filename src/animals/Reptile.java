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
     * Initializes a newly created Reptile object so that it represents an empty
     * Animal.
     * It sets a random value for the habitat
     */
    
    public Reptile(){
        this.habitat = StoredDataUtility.habitat[r.nextInt(StoredDataUtility.habitat.length)];
    }

    /**
     * Returns the habitat of the Reptile
     * @return A String containing the Reptile's habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * Sets the habitat where the Reptile lives in
     * @param habitat The habitat to be set
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    /**
     * Returns unique properties of class
     * Method is invoked on superclass
     * @return A String the reptile's habitat
     * @see Animal#toString() 
     */
    @Override
    public String getProperties(){
        String output = " Natural habitat: " + this.habitat + "\n";
        return output;
    }
}
