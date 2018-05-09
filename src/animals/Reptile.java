package animals;

import java.util.Random;
import setuphelper.StoredDataUtility;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class Reptile extends Animal {

    private String habitat;

    Random r = new Random();

    public StoredDataUtility sDU = new StoredDataUtility();

    public Reptile() {
        this.setHabitat(sDU.habitat[r.nextInt(sDU.habitat.length)]);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String getProperties() {
        String output = " Natural habitat: " + this.habitat + "\n";
        return output;
    }
}
