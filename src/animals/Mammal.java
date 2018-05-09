/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import java.util.Random;
import setuphelper.StoredDataUtility;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class Mammal extends Animal{
    
    private boolean fur;
    private boolean pregnancy;
    private String furColor;
    
    Random r = new Random();
    
    public StoredDataUtility sDU = new StoredDataUtility();

    public Mammal(){
        this.setFur(r.nextBoolean());
        this.setPregnancy(r.nextBoolean());
        if(this.getFur() != false){
            this.setFurColor(sDU.color[r.nextInt(sDU.color.length)]);
        }
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
    
    @Override
    public String getProperties(){
        String output = " Has fur: " + this.fur + "\n";
        output += " Is pregnant: " + this.pregnancy + "\n";
        output += " Fur colour: " + this.furColor + "\n";
        return output;
    }
    
}
