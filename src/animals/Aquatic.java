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
public class Aquatic extends Animal{

    private boolean marine;
    private boolean freshWater;

    public Aquatic(){

    }

    public boolean getMarine(){
      return this.marine;
    }

    public boolean getFreshWater(){
      return this.marine;
    }

    public void setMarine(boolean marine){
      this.marine = marine;
    }

    public void setFreshWater(boolean freshWater){
      this.freshWater = freshWater;
    }

}
