package cctzoo;

import java.util.InputMismatchException;
import java.util.Scanner;
import keeper.Keeper;
import setuphelper.Printing;
import setuphelper.SetUpDataUtility;

/**
 *
 * @author marcos
 */
public class Menu {
    
    Printing printOut = new Printing();
    Scanner selection = new Scanner(System.in);
    
      
    public void Options(SetUpDataUtility setData){

        
            System.out.println("MENU");
            System.out.println("");
            System.out.println("[1] Search for Animal");
            System.out.println("[2] Search for Keeper");
            System.out.println("[3] Add new Animal");
            System.out.println("[4] Add new Keeper");
            System.out.println("[5] Update Animal");
            System.out.println("[6] Update Keeper");
            System.out.println("[7] Exit");
            System.out.println("");
            System.out.print("Please make your choice from the options above: ");
            int option = selection.nextInt();
            
            try{
                switch(option){
                    case 1:
                        
                        break;
                    case 2:
                        printOut.displayKeepers(setData);
                        System.out.println();
                        Options(setData);
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    case 6:
                        
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
            }catch(InputMismatchException e){
                System.out.println("Please, try again");
                selection.next();
                Options(setData);
            }
    }
    
}
