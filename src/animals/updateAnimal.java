package animals;

import java.util.InputMismatchException;
import java.util.Scanner;
import setuphelper.Printing;
import setuphelper.SetUpDataUtility;

/**
 *
 * @author Marcos
 */
public class updateAnimal {
    
    Scanner sc = new Scanner(System.in);
    
    public void addAnimal(){
        
    }
    public void searchAnimal(SetUpDataUtility setData,Printing printOut){
        System.out.println();
        System.out.println("----Searching for Animals----");
        System.out.println("[1] Search for Aquatic animals");
        System.out.println("[2] Search for Avian animals");
        System.out.println("[3] Search for Insect animals");
        System.out.println("[4] Search for Mammal animals");
        System.out.println("[5] Search for Reptile animals");
        System.out.println("[6] Cancel");
        System.out.println();
        System.out.print("Please select an option from the list above: ");
        int option = sc.nextInt();
        
        try{
                switch(option){
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    case 6:
                        System.out.println();
                        break;
                    default:
                        System.out.println("Please, try again");
                        System.out.println();
                        searchAnimal(setData, printOut);
                }
            }catch(InputMismatchException e){
                System.out.println("Please, try again");
                System.out.println();
                searchAnimal(setData, printOut);
            }
    
    }
}
