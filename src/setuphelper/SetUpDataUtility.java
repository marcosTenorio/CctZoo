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
        currentKeeper.stream().map((k) -> {
            String keeperName = sDU.keeperFirstName[r.nextInt(sDU.keeperFirstName.length)];
            keeperName += sDU.keeperSurname[r.nextInt(sDU.keeperSurname.length)];
            k.setName(keeperName);
            return k;
        }).forEachOrdered((k) -> {
            k.setDob(sDU.keeperDob[r.nextInt(sDU.keeperDob.length)]);
        });
    }
    
    
    
}
