package setuphelper;

import animals.deprecated.Bat;
import java.util.ArrayList;
import java.util.Random;
import keeper.Keeper;
import animals.Animal;

/**
 *
 * @author marcos
 */
public class SetUpDataUtility {
    
    int amtOfKeepers = 40; //amount of Keepers
    int amtOfAnimals = 100; //amount of Animals
    
    
    public StoredDataUtility sDU = new StoredDataUtility();
    
    public ArrayList<Keeper>   currentKeeper  = new ArrayList();
    
    public ArrayList<Animal>   currentAnimal  = new ArrayList();
    
    Random r = new Random();
    
    
    public void getItReady(){
        createData();
        fillKeepers();
    }
    
    
    public void createData(){
        
       for(int i = 0; i < amtOfKeepers; i++){
           currentKeeper.add(new Keeper());
       }
       for(int i = 0; i < amtOfAnimals; i++){
           currentAnimal.add(new Bat());
       }
    }
    
    public void fillKeepers(){
        for(Keeper k : currentKeeper){
            k.setName(sDU.keeperNames[r.nextInt(sDU.keeperNames.length)]);
            k.setDob(sDU.keeperDob[r.nextInt(sDU.keeperDob.length)]);
        }
    }
    
    
}
