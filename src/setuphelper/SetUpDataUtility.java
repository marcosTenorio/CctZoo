package setuphelper;

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
<<<<<<< HEAD
    
    public static ArrayList<Keeper>   listOfKeepers  = new ArrayList();
    public static ArrayList<Animal>   listOfAnimals  = new ArrayList();
    
=======

    public ArrayList<Keeper> currentKeeper = new ArrayList();

    public ArrayList<Animal> currentAnimal = new ArrayList();

>>>>>>> AnimalsRefactor
    Random r = new Random();

    public void getItReady() {
        createData();
        fillKeepers();
    }
<<<<<<< HEAD
    
    public void createData(){
        
       for(int i = 0; i < amtOfKeepers; i++){
           listOfKeepers.add(new Keeper());
       }
       
       for(int i = 0; i < amtOfAnimals; i++){
           int randomAnimalNumber = (r.nextInt(5) + 1);
           listOfAnimals.add(createRandomAnimal(randomAnimalNumber));
       }
=======

    public void createData() {

        for (int i = 0; i < amtOfKeepers; i++) {
            currentKeeper.add(new Keeper());
        }

        for (int i = 0; i < amtOfAnimals; i++) {
            int randomAnimalNumber = (r.nextInt(5) + 1);
            currentAnimal.add(createRandomAnimal(randomAnimalNumber));
        }
>>>>>>> AnimalsRefactor
    }

    private Animal createRandomAnimal(int num) {
        switch (num) {
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
<<<<<<< HEAD
    
    public void fillKeepers(){
        listOfKeepers.stream().map((k) -> {
            String keeperFirstName = sDU.keeperFirstName[r.nextInt(sDU.keeperFirstName.length)];
            String keeperLastName = sDU.keeperSurname[r.nextInt(sDU.keeperSurname.length)];
            k.setName(keeperFirstName, keeperLastName);
=======

    public void fillKeepers() {
        currentKeeper.stream().map((k) -> {
            String keeperName = sDU.keeperFirstName[r.nextInt(sDU.keeperFirstName.length)];
            keeperName += sDU.keeperSurname[r.nextInt(sDU.keeperSurname.length)];
            k.setName(keeperName);
>>>>>>> AnimalsRefactor
            return k;
        }).forEachOrdered((k) -> {
            k.setDob(sDU.keeperDob[r.nextInt(sDU.keeperDob.length)]);
        });
    }
<<<<<<< HEAD
    
    public void fillAnimals(){
        
    }

    public static ArrayList<Animal> getListOfAnimals() {
        return listOfAnimals;
    }
    
=======

>>>>>>> AnimalsRefactor
}
