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
    
    public void addAnimal(SetUpDataUtility setData, Printing printOut){
        System.out.println();
        System.out.println("----Adding an Animal----");
        System.out.println("[1] Add an Aquatic animal");
        System.out.println("[2] Add an Avian animal");
        System.out.println("[3] Add an Insect animal");
        System.out.println("[4] Add a Mammal animal");
        System.out.println("[5] Add a Reptile animal");
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
                        addAnimal(setData, printOut);
            }
        }catch(InputMismatchException e){
                System.out.println("Please, try again");
                System.out.println();
                addAnimal(setData, printOut);
        }
    }
    
    public void printAnimals(String type){
        for (Animal animal : Animal.list(type.toUpperCase())) {
            System.out.print("ID: " + animal.getExhibitNumber());
            System.out.print(" Name: " + animal.getName());
            System.out.print(" | " + animal.getPetName());
            System.out.println(" | " + animal.getKeeper().getName());
        }
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
                            printAnimals("AQUATIC");

                            
                            printAnimals("AQUATIC");
                            printAnimals("AQUATIC");
                        break;
                    case 2:
                            printAnimals("AVIAN");
                        break;
                    case 3:
                            printAnimals("INSECT");
                        break;
                    case 4:
                            printAnimals("MAMMAL");
                        break;
                    case 5:
                            printAnimals("REPTILE");
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
    
    public void updateAnimal(SetUpDataUtility setData, Printing printOut){
        System.out.println();
        System.out.println("----Updating Animal----");
        
    }
}
