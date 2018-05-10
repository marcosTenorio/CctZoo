package setuphelper;

import animals.Animal;
import keeper.Keeper;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class Printing {

    /**
     * method displays the full list of Keepers, displaying only the number id
     * and names
     *
     * @param setData variable of type SetUpDataUtility
     * @see SetUpDataUtility
     */
    public void displayKeepers(SetUpDataUtility setData) {

        for (int i = 0; i < setData.listOfKeepers.size(); i++) {
            Keeper k = setData.listOfKeepers.get(i);
            System.out.print("Keeper ID: " + (i + 1));
            System.out.println(" | " + k.getName());
        }
    }

    /**
     * method displays the full list of Animals, displaying only the exhibit
     * number, name, pet name and responsible keeper
     *
     * @param setData variable of type SetUpDataUtility
     * @param type variable of type String
     * @see SetUpDataUtility
     */
    public void printAnimals(SetUpDataUtility setData, String type) {
        for (Animal animal : Animal.list(type.toUpperCase())) {
            System.out.print("Exhibit Number: " + animal.getExhibitNumber());
            System.out.print(" Name: " + animal.getName());
            System.out.println(" | " + animal.getPetName());
            System.out.println("  Responsible Keeper: " + animal.getKeeper().getName() + "\n");
        }
    }
}
