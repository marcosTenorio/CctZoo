
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
        
        for(int i = 0; i < setData.currentKeeper.size(); i++){
            System.out.println("Keeper nº " +(i+1));
            Keeper k = setData.currentKeeper.get(i);
            System.out.println("Name: " + k.getName());
            //System.out.println("Date of birth: " + k.getDob());
            System.out.println();
            System.out.println("//////////////////////");
            System.out.println();
        }
    }
    public void displayAnimals(SetUpDataUtility setData){
        for(int i = 0; i < setData.currentAnimal.size(); i++){
            Animal a = setData.currentAnimal.get(i);
            System.out.println("Exhibit number: " + a.getExhibitNumber());
            System.out.println("Name: " + a.getName());
            System.out.println("Date of birth: " + a.getDob());
            System.out.println("Date of arrival: " + a.getDoa());
            System.out.println("gender: " + a.getGender());
            System.out.println("offspring? "+ a.isOffspring());
            System.out.println("Medication: " + a.getMedication());
            System.out.println("Vaccine: " + a.getVaccine());
            System.out.println();
            System.out.println("//////////////////////");
            System.out.println();
        }
    }
}
