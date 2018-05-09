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
public class Aquatic extends Animal{

    private boolean marine;
    private boolean freshWater;
    
    Random r = new Random();

    /**
     *
     */
    public Aquatic(){
        this.setMarine(r.nextBoolean());
        this.setFreshWater(r.nextBoolean());
    }

    /**
     *
     * @return
     */
    public boolean getMarine(){
      return this.marine;
    }

    /**
     *
     * @return
     */
    public boolean getFreshWater(){
      return this.marine;
    }

    /**
     *
     * @param marine
     */
    public void setMarine(boolean marine){
      this.marine = marine;
      if(this.marine == true){
          this.freshWater = false;
      }else{
          this.freshWater = true;
      }
    }

    /**
     *
     * @param freshWater
     */
    public void setFreshWater(boolean freshWater){
      this.freshWater = freshWater;
      if(this.freshWater == true){
          this.marine = false;
      }else{
          this.marine = true;
      }
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getProperties(){
        String output = " is marine: " + this.marine + "\n";
        output += " is fresh water: " + this.freshWater + "\n";
        return output;
    }

}
