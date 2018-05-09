/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import java.util.Random;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class Insect extends Animal {

    private boolean morphed;

    Random r = new Random();

    public Insect() {
        this.setMorphed(r.nextBoolean());
    }

    public boolean isMorphed() {
        return morphed;
    }

    public void setMorphed(boolean morphed) {
        this.morphed = morphed;
    }

    @Override
    public String getProperties() {
        String output = " Has morphed: " + this.morphed + "\n";
        return output;
    }

}
