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
public class Insect extends Animal{

    private boolean morphed;

    public Insect(){

    }

    public boolean isMorphed() {
        return morphed;
    }

    public void setMorphed(boolean morphed) {
        this.morphed = morphed;
    }
    
}
