package keeper;

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
        k.setName(firstName + surname);
        k.setDob(dob);
        setData.currentKeeper.add(k);
        System.out.print("Would you like to add other keeper? (y/n)");
        String u = sc.next();
        if(u.equals("y")){
            addKeeper(setData, printOut);
        }
    }
    
    public void updateKeeper(){
        
    }
}
