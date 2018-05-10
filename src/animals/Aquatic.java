package animals;

import java.util.Random;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */

public class Aquatic extends Animal{

    private boolean marine;
    private boolean freshWater;
    
    Random r = new Random();

    /**
     * Initializes a newly created Aquatic object so that it represents an empty Animal.
     */
    public Aquatic(){
        setMarine(r.nextBoolean());
        setFreshWater(r.nextBoolean());
    }

    /**
     * Returns if Aquatic is marine
     * @return A if animal is marine or not
     */
    public boolean getMarine(){
      return this.marine;
    }

    /**
     * Returns if Aquatic is freshwater
     * @return A boolean whether the Aquatic is freshwater or not
     */
    public boolean getFreshWater(){
      return this.marine;
    }

    /**
     * Sets if the Aquatic is marine or not
     * @param marine A boolean to define if Aquatic is marine or not
     */
    public final void setMarine(boolean marine){
      this.marine = marine;
      this.freshWater = this.marine != true;
    }

    /**
     * Sets if the Aquatic is freshwater or not 
     * @param freshWater A boolean to define if Aquatic is freshWater or not
     */
    public final void setFreshWater(boolean freshWater){
      this.freshWater = freshWater;
      this.marine = this.freshWater != true;
    }
    
    /**
     * Returns unique properties of class
     * Method is invoked on superclass
     * @return A String showing the values of marine and freshWater
     * @see Animal#toString() 
     */
    @Override
    public String getProperties(){
        String output = " is marine: " + this.marine + "\n";
        output += " is fresh water: " + this.freshWater + "\n";
        return output;
    }
    
}
