package animals;

import java.util.Random;
import setuphelper.StoredDataUtility;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class Mammal extends Animal {

    private boolean fur;
    private boolean pregnancy;
    private String furColor;

    Random r = new Random();

    /**
     * Initializes a newly created Insect object so that it represents an empty
     * Animal.
     * It sets a random value for the booleans fur and pregnancy.
     * In case fur happens to be true, it gets a random color to set the fur color
     */
    public Mammal() {
        fur = r.nextBoolean();
        pregnancy = r.nextBoolean();
        
        if (fur != false) {
            furColor = StoredDataUtility.color[r.nextInt(StoredDataUtility.color.length)];
        }
    }

    /**
     * Returns the boolean for fur
     * @return If the Mammal has fur or not
     */
    public boolean getFur() {
        return fur;
    }

    /**
     * Sets whether the Mammal has fur or not
     * @param fur The boolean value for fur
     */
    public final void setFur(boolean fur) {
        this.fur = fur;
    }

    /**
     * Returns a boolean for the Mammal's pregnancy
     * @return
     */
    //TODO: If gender == true then prgnancy = false
    public boolean getPregnancy() {
        return pregnancy;
    }

    /**
     * Defines if Mammal is pregnant or not
     * @param pregnancy
     */
    public void setPregnancy(boolean pregnancy) {
        //TODO: if Mammal's gender == male; return
        this.pregnancy = pregnancy;
    }

    /**
     * Returns the color of the Mammal's fur
     * @return
     */
    public String getFurColor() {
        return furColor;
    }

    /**
     * Sets the color of the Mammal's fur color
     * @param furColor The color of the fur to be set
     */
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    /**
     * Returns unique properties of class
     * Method is invoked on superclass
     * @return A String showing whether the animals has fur, the pregnancy
     * status and the color of the fur
     * @see Animal#toString() 
     */
    @Override
    public String getProperties() {
        String output = " Has fur: " + this.fur + "\n";
        output += " Is pregnant: " + this.pregnancy + "\n";
        output += " Fur colour: " + this.furColor + "\n";
        return output;
    }

}
