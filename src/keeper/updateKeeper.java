package keeper;

import java.util.Scanner;
import setuphelper.Printing;
import setuphelper.SetUpDataUtility;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class updateKeeper {

    Scanner sc = new Scanner(System.in);
    
    /**
     * method asks the user to inform name and 
     * date of birth of the new Keeper and include 
     * it to the keepers array list
     * @param setData the SetUpDataUtility class
     * @param printOut the Printing class
     * @see SetUpDataUtility
     * @see Printing
     */
    public void addKeeper(SetUpDataUtility setData, Printing printOut) {
        System.out.println();
        System.out.println("----Adding new Keeper------");
        System.out.print("First name: ");
        String firstName = sc.next();
        System.out.print("Surname: ");
        String surname = sc.next();
        System.out.print("Date of birth(DD/MM/YYYY): ");
        String dob = sc.next();
        Keeper k = new Keeper();
        k.setName(firstName, surname);
        k.setDob(dob);
        setData.listOfKeepers.add(k);
        System.out.print("Would you like to add other keeper? (y/n)");
        String u = sc.next();
        if (u.equals("y")) {
            addKeeper(setData, printOut);
        }
    }
    
    /**
     * method asks the user to choose a keeper to update,
     * then asks for new data and update the chosen Keeper 
     * @param setData the SetUpDataUtility class
     * @param printOut the Printing class
     * @see SetUpDataUtility
     * @see Printing
     */
    public void updateKeeper(SetUpDataUtility setData, Printing printOut) {
        System.out.println();
        System.out.println("----Updating Keeper----");
        System.out.print("Please insert the keeper id you would like to update: ");
        int id = sc.nextInt();
        if (id > setData.listOfKeepers.size()) {
            System.out.println();
            System.out.println("please, try again");
            updateKeeper(setData, printOut);
        }else{
            Keeper k = setData.listOfKeepers.get(id-1);
            System.out.println();
            System.out.println("Name: "+ k.getName());
            System.out.println("Date of birth: "+ k.getDob());
            System.out.println();
            System.out.print("new first name: ");
            String fname = sc.next();
            System.out.print("new surname: ");
            String surname = sc.next();
            System.out.print("new date of birth(dd//mm/yyyy): ");
            String dob = sc.next();
            k.setName(fname, surname);
            k.setDob(dob);
            System.out.println();
            System.out.println("Keeper updated!");
            System.out.println();
            System.out.print("display keepers?(y/n): ");
            String i = sc.next();
            if (i.equals("y")) {
                printOut.displayKeepers(setData);
                System.out.println();
            } else {
                System.out.println();
            }
        }
    }
    
    /**
     * method asks for the user to choose the Keeper from the
     * list and displays all information about the chosen Keeper
     * @param setData the SetUpDataUtility class
     * @param printOut the Printing class
     * @see SetUpDataUtility
     * @see Printing
     */
    public void searchKeeper(SetUpDataUtility setData, Printing printOut) {
        System.out.println();
        System.out.print("Select keeper's id, from the list above, to see more info: ");
        int id = sc.nextInt();
        Keeper k = setData.listOfKeepers.get(id - 1);
        System.out.println();
        System.out.println(k.toString());
        System.out.print("Would you like to keep searching? (y/n)");
        String a = sc.next();
        if (a.equals("y")) {
            printOut.displayKeepers(setData);
            System.out.println();
            searchKeeper(setData, printOut);
        }else{
            System.out.println();
        }
    }
}
