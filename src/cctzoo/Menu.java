package cctzoo;

import animals.updateAnimal;
import java.util.InputMismatchException;
import java.util.Scanner;
import keeper.updateKeeper;
import setuphelper.Printing;
import setuphelper.SetUpDataUtility;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class Menu {

    Printing printOut = new Printing();

    updateKeeper uptKeeper = new updateKeeper();

    updateAnimal uptAnimal = new updateAnimal();

    Scanner selection = new Scanner(System.in);

    /**
     *
     * @param setData
     */
    public void Options(SetUpDataUtility setData) {
        System.out.println("| MENU |");
        System.out.println();
        System.out.println("[1] Search for Animal");
        System.out.println("[2] Search for Keeper");
        System.out.println("[3] Add new Animal");
        System.out.println("[4] Add new Keeper");
        System.out.println("[5] Update Animal");
        System.out.println("[6] Update Keeper");
        System.out.println("[7] Exit");
        System.out.println();
        System.out.print("Please make your choice from the options above: ");
        int option = selection.nextInt();

        try {
            switch (option) {
                case 1:
                    uptAnimal.searchAnimal(setData, printOut);
                    System.out.println();
                    Options(setData);
                    break;
                case 2:
                    printOut.displayKeepers(setData);
                    uptKeeper.searchKeeper(setData, printOut);
                    System.out.println();
                    Options(setData);
                    break;
                case 3:
                    uptAnimal.addAnimal(setData, printOut);
                    System.out.println();
                    Options(setData);
                    break;
                case 4:
                    uptKeeper.addKeeper(setData, printOut);
                    System.out.println();
                    Options(setData);
                    break;
                case 5:
                    uptAnimal.updateAnimal(setData, printOut);
                    System.out.println();
                    Options(setData);
                    break;
                case 6:
                    printOut.displayKeepers(setData);
                    uptKeeper.updateKeeper(setData, printOut);
                    Options(setData);
                    break;
                case 7:
                    System.out.println("Thanks for visiting....... bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("");
                    System.out.println("No options match your input");
                    System.out.println("Please, try again");
                    Options(setData);
            }
        } catch (InputMismatchException e) {
            System.out.println("Please, try again");
            selection.next();
            Options(setData);
        }
    }
}
