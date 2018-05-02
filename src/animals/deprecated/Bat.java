/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals.deprecated;

import animals.Animal;
import animals.interfaces.IAvian;
import animals.interfaces.IMammal;






/**
 *
 * @author marcos
 */
public class Bat extends Animal implements IMammal, IAvian{

    
   

   
    
    @Override
    public void breastFeed() {
        System.out.println("feed");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
    
}
