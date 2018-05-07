package setuphelper;

import animals.deprecated.Bat;
import java.util.ArrayList;
import java.util.Random;
import keeper.Keeper;
import animals.Animal;
import animals.Aquatic;
import animals.Avian;
import animals.Insect;
import animals.Mammal;
import animals.Reptile;


/**
 *
 * @author marcos
 */
public class SetUpDataUtility {
    
    
    
    int amtOfKeepers = 40; //amount of Keepers
    int amtOfAnimals = 100; //amount of Animals
    
    public StoredDataUtility sDU = new StoredDataUtility();
    
    public static ArrayList<Keeper>   listOfKeepers  = new ArrayList();
    public static ArrayList<Animal>   listOfAnimals  = new ArrayList();
    
    Random r = new Random();
    
    
    public void getItReady(){
        createData();
        fillKeepers();
    }
    
    public void createData(){
        
       for(int i = 0; i < amtOfKeepers; i++){
           listOfKeepers.add(new Keeper());
       }
       
       for(int i = 0; i < amtOfAnimals; i++){
           int randomAnimalNumber = (r.nextInt(5) + 1);
           listOfAnimals.add(createRandomAnimal(randomAnimalNumber));
       }
    }
    
    
    
    private Animal createRandomAnimal(int num){
        switch(num){
               case 1:
                   return new Aquatic();
               case 2:
                   return new Avian();
               case 3:
                   return new Insect();
               case 4:
                   return new Mammal();
               case 5:
                   return new Reptile();
               default:
                   return null;
           }
    }
    
    public void fillKeepers(){
        listOfKeepers.stream().map((k) -> {
            String keeperFirstName = sDU.keeperFirstName[r.nextInt(sDU.keeperFirstName.length)];
            String keeperLastName = sDU.keeperSurname[r.nextInt(sDU.keeperSurname.length)];
            k.setName(keeperFirstName, keeperLastName);
            return k;
        }).forEachOrdered((k) -> {
            k.setDob(sDU.keeperDob[r.nextInt(sDU.keeperDob.length)]);
        });
    }
    
    public void fillAnimals(){
        
    }

    public static ArrayList<Animal> getListOfAnimals() {
        return listOfAnimals;
    }
    
}
