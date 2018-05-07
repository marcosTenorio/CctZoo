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
public class Mammal extends Animal{
    
    private boolean fur;
    private boolean pregnancy;
    private String furColor;

    public Mammal(){

    }

    public boolean getFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public boolean getPregnancy() {
        return pregnancy;
    }

    public void setPregnancy(boolean pregnancy) {
        this.pregnancy = pregnancy;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    
}
