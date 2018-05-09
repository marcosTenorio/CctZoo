
package setuphelper;

import animals.Animal;
import keeper.Keeper;

/**
 *
 * @author marcos
 */
public class Printing {
    
    /**
     *
     * @param setData
     */
    public void displayKeepers(SetUpDataUtility setData){
        
        for(int i = 0; i < setData.listOfKeepers.size(); i++){
            Keeper k = setData.listOfKeepers.get(i);
            System.out.print("Keeper ID: " +(i+1));
            System.out.println(" | " + k.getName());
        }
    }
    
    /**
     *
     * @param setData
     * @param type
     */
    public void printAnimals(SetUpDataUtility setData, String type){
        for (Animal animal : Animal.list(type.toUpperCase())) {
            System.out.print("Exhibit Number: " + animal.getExhibitNumber());
            System.out.print(" Name: " + animal.getName());
            System.out.println(" | " + animal.getPetName());
            System.out.println("  Responsible Keeper: " + animal.getKeeper().getName() + "\n");
        }
    }
}
