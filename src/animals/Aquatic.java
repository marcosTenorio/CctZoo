package animals;

import java.util.Random;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class Aquatic extends Animal {

    private boolean marine;
    private boolean freshWater;

    Random r = new Random();

    public Aquatic() {
        this.setMarine(r.nextBoolean());
        this.setFreshWater(r.nextBoolean());
    }

    public boolean getMarine() {
        return this.marine;
    }

    public boolean getFreshWater() {
        return this.marine;
    }

    public void setMarine(boolean marine) {
        this.marine = marine;
        if (this.marine == true) {
            this.freshWater = false;
        } else {
            this.freshWater = true;
        }
    }

    public void setFreshWater(boolean freshWater) {
        this.freshWater = freshWater;
        if (this.freshWater == true) {
            this.marine = false;
        } else {
            this.marine = true;
        }
    }

    @Override
    public String getProperties() {
        String output = " is marine: " + this.marine + "\n";
        output += " is fresh water: " + this.freshWater + "\n";
        return output;
    }

}
