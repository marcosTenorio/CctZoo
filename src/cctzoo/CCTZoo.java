package cctzoo;

import animals.deprecated.Bat;
import java.util.Scanner;
import keeper.Keeper;
import setuphelper.SetUpDataUtility;
import animals.Animal;
import animals.interfaces.IMammal;

/**
 *
 * @author marcos
 */
public class CCTZoo {

    public static void main(String[] args) {
        
        
        SetUpDataUtility setData = new SetUpDataUtility();
        Menu menu = new Menu();
        setData.getItReady();
        System.out.println("-/-/-/-/-/-/-/--//-/-/-/-/-/-/-");
        System.out.println("WELCOME TO THE CCT ZOO");
        System.out.println("-/-/-/-/-/-/-/--//-/-/-/-/-/-/-");
        System.out.println("");
        menu.Options(setData);
        
        }
    
    
    
}
