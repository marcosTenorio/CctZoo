
package setuphelper;

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
            System.out.println("Date of birth: " + k.getDob());
            System.out.println();
            System.out.println("//////////////////////");
            System.out.println();
        }
    }
}
