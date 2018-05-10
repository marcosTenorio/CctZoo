package animals;

import java.util.Random;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class Insect extends Animal{

    private boolean morphed;
    
    Random r = new Random();

    /**
     * Initializes a newly created Insect object so that it represents an empty Animal.
     */
    public Insect(){
        setMorphed(r.nextBoolean());
    }

    /**
     * Returns whether Insect has been m or not
     * @return The a boolean informing if it has or has not morphed
     */
    public boolean isMorphed() {
        return morphed;
    }

    /**
     * Sets the value of the boolean morphed
     * @param morphed Boolean to set the value of morphed
     */
    public final void setMorphed(boolean morphed) {
        this.morphed = morphed;
    }
    
     
    /**
     * Returns unique properties of class
     * Method is invoked on superclass
     * @return A String showing the value of morphed
     * @see Animal#toString() 
     */
    @Override
    public String getProperties(){
        String output = " Has morphed: " + this.morphed + "\n";
        return output;
    }
    
}
