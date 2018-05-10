package animals;

import java.util.Random;
import setuphelper.StoredDataUtility;
/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class Avian extends Animal{
    
    private boolean feathered;
    private String feathersColor;
    
    Random r = new Random();
    
    public StoredDataUtility sDU = new StoredDataUtility();
    
    /**
     * Initializes a newly created Avian object so that it represents an empty Animal.
     * Sets a random boolean for feathered
     */
    public Avian(){
        setFeathered(r.nextBoolean());
        if(isFeathered() != false){
            setFeathersColor(sDU.color[r.nextInt(sDU.color.length)]);
        }
    }
    
    /**
     * Returns the color of the animal's feathers
     * @return A String with the colors of the feathers of the Avian
     */
    public String getFeathersColor() {
        return feathersColor;
    }

    /**
     * Sets the colors of the feathers
     * @param feathersColor A String containing the colors of the feathers
     */
    public final void setFeathersColor(String feathersColor) {
        this.feathersColor = feathersColor;
    }

    /**
     * Returns a boolean whether the Avian is feathered
     * @return a boolean true if animal is feathered, false if it is not
     */
    public final boolean isFeathered() {
        return feathered;
        
    }

    /**
     * Sets a boolean to define if animal is feathered
     * @param feathered A boolean to define if Animal has feathers
     */
    public final void setFeathered(boolean feathered) {
        this.feathered = feathered;
    }
    
    /**
     * Returns unique properties of class
     * Method is invoked on superclass
     * @return A String showing the values of feathered and feathersColor
     * @see Animal#toString() 
     */
    @Override
    public String getProperties(){
        String output = " is feathered: " + this.feathered + "\n";
        output += " Feathers colour: " + this.feathersColor + "\n";
        return output;
    }
    
}
