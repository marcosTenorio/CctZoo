package keeper;

import java.util.InputMismatchException;
import java.util.Scanner;
import setuphelper.Printing;
import setuphelper.SetUpDataUtility;

/**
 *
 * @author marcos
 */
public class updateKeeper {
    
    Scanner sc = new Scanner(System.in);
    
    public void addKeeper(SetUpDataUtility setData,Printing printOut){
        System.out.println();
        System.out.println("----Adding new Keeper------");
        System.out.print("First name: ");
        String firstName = sc.next();
        System.out.print("Surname: ");
        String surname = sc.next();
        System.out.print("Date of birth(DD/MM/YYYY): ");
        String dob = sc.next();
        Keeper k = new Keeper();
        k.setName(firstName + " " + surname);
        k.setDob(dob);
        setData.currentKeeper.add(k);
        System.out.print("Would you like to add other keeper? (y/n)");
        String u = sc.next();
        if(u.equals("y")){
            addKeeper(setData, printOut);
        }
    }
    
    public void updateKeeper(SetUpDataUtility setData,Printing printOut){
        System.out.println();
        System.out.println("----Updating Keeper----");
        System.out.print("Please insert the keeper id you would like to update: ");
        int id = sc.nextInt();
        if(id > setData.currentKeeper.size()){
            System.out.println();
            System.out.println("please, try again");
            updateKeeper(setData, printOut);
        }else{
            Keeper k = setData.currentKeeper.get(id-1);
            System.out.print("new first name: ");
            String fname = sc.next();
            System.out.print("new surname: ");
            String surname = sc.next();
            System.out.print("new date of birth(dd//mm/yyyy): ");
            String dob = sc.next();
            k.setName(fname + " " + surname);
            k.setDob(dob);
            System.out.println("Keeper updated!");
            System.out.print("display keepers?(y/n): ");
            String i = sc.next();
            if(i.equals("y")){
                printOut.displayKeepers(setData);
            }else{
                System.out.println();
            }
        }  
    }
    
    public void searchKeeper(SetUpDataUtility setData,Printing printOut){
        System.out.println();
            System.out.print("Select keeper's id, from the list above, to see more info: ");
            int id = sc.nextInt();
            Keeper k = setData.currentKeeper.get(id-1);
            System.out.println(k.toString());
            System.out.print("Would you like to keep searching? (y/n)");
            String a = sc.next();
            if(a.equals("y")){
                printOut.displayKeepers(setData);
                searchKeeper(setData, printOut);
            }
   
    }
    
    
}
