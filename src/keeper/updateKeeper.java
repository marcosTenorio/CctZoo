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
        System.out.println("----Searching for Keeper----");
        System.out.println("[1] Search by name");
        System.out.println("[2] Search by date of birth");
        System.out.println("[3] Cancel");
        System.out.println("");
            System.out.print("Please make your choice from the options above: ");
            int option = sc.nextInt();
            
            try{
                switch(option){
                    case 1:
                        searchName(setData, printOut);
                        break;
                    case 2:
                        searchDob(setData, printOut);
                        break;
                    case 3:
                        System.out.println();
                        break;
                    default:
                        System.out.println("Please, try again");
                        System.out.println();
                        searchKeeper(setData, printOut);
                }
            }catch(InputMismatchException e){
                System.out.println("Please, try again");
                System.out.println();
                searchKeeper(setData, printOut);
            }
        
    }
    
    public void searchName(SetUpDataUtility setData,Printing printOut){
        System.out.print("Please, enter the first name: ");
        String f = sc.next();
        System.out.print("surname: ");
        String s = sc.next();
        String n = "";
        String dob = "";
        int id;
        for(int i = 0; i < setData.currentKeeper.size(); i++){ //not working
            Keeper k = setData.currentKeeper.get(i);
            if(k.getDob().equals(f + " "+ s)){
                n = k.getName();
                dob = k.getDob();
                id = (i+1);
            }
        }
        if(n.equals("") && dob.equals("")){
            System.out.println();
            System.out.println("keeper not found!");
            System.out.print("try again?(y/n): ");
            String v = sc.next();
            if(s.equals("y")){
                searchKeeper(setData, printOut);
            }else{
                System.out.println();
            }
        }else{
            System.out.println("");
            System.out.println("---Results found----");
            System.out.println("Keeper nº ");
            System.out.println("Name: " + n);
            System.out.println("Date of birth: " + dob);
            System.out.println();
            System.out.println("//////////////////////");
            System.out.println();
        }
        
    }
    public void searchDob(SetUpDataUtility setData,Printing printOut){
        System.out.print("Please, enter the date of birth(dd/mm/yyyy): ");
        String x = sc.next();
        String n = "";
        String dob = "";
        int id = 0;
        for(int i = 0; i < setData.currentKeeper.size(); i++){ //what if more than one result?
            Keeper k = setData.currentKeeper.get(i);
            if(k.getDob().equals(x)){
                n = k.getName();
                dob = k.getDob();
                id = (i+1);
            }
        }
        if(n.equals("") && dob.equals("")){
            System.out.println();
            System.out.println("keeper not found!");
            System.out.print("try again?(y/n): ");
            String s = sc.next();
            if(s.equals("y")){
                searchKeeper(setData, printOut);
            }else{
                System.out.println();
            }
        }else{
            System.out.println("");
            System.out.println("---Results found----");
            System.out.println("Keeper nº "+ id);
            System.out.println("Name: " + n);
            System.out.println("Date of birth: " + dob);
            System.out.println();
            System.out.println("//////////////////////");
            System.out.println();
        }
    }
}
