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
import animals.SubType;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class SetUpDataUtility {

    int amtOfKeepers = 40; //amount of Keepers
    int amtOfAnimals = 100; //amount of Animals

    public StoredDataUtility sDU = new StoredDataUtility();

    public static ArrayList<Keeper> listOfKeepers = new ArrayList();
    public static ArrayList<Animal> listOfAnimals = new ArrayList();
    
    public static SubType[] animalSubtype = new SubType[]{SubType.AQUATIC,
        SubType.AVIAN, SubType.INSECT, SubType.MAMMAL, SubType.REPTILE};
    
    Random r = new Random();

    public void getItReady() {
        createData();
        fillKeepers();
        fillAnimals();
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

    public void fillKeepers() {
        listOfKeepers.stream().map((Keeper k) -> {
            String keeperFirstName = sDU.keeperFirstName[r.nextInt(sDU.keeperFirstName.length)];
            String keeperLastName = sDU.keeperSurname[r.nextInt(sDU.keeperSurname.length)];
            k.setName(keeperFirstName, keeperLastName);
            
            for (SubType subType : StoredDataUtility.subType) {
                k.addAnimalType(StoredDataUtility.subType[r.nextInt(StoredDataUtility.subType.length)]);
            }
            
            return k;
        }).forEachOrdered((k) -> {
            k.setDob(sDU.keeperDob[r.nextInt(sDU.keeperDob.length)]);
        });
        
    }
    
    public void fillAnimals() {
        listOfAnimals.stream().forEach((Animal animal) -> {
            animal.setName(sDU.animalsName[r.nextInt(sDU.animalsName.length)]);
            animal.setPetName(sDU.petsName[r.nextInt(sDU.petsName.length)]);
            animal.setKeeper(getAvailableZookeeper(animal));
            animal.setDob(sDU.animalDob[r.nextInt(sDU.animalDob.length)]);
            animal.setDoa(sDU.dateOfArrival[r.nextInt(sDU.dateOfArrival.length)]);
            animal.setGender(sDU.gender[r.nextInt(sDU.gender.length)]);
            animal.setVaccine(r.nextBoolean());
            animal.setOffspring(r.nextBoolean());
        });
    }
    
    public Keeper getAvailableZookeeper(Animal animal){
        int rn = r.nextInt(listOfKeepers.size());

        boolean isCompatible = listOfKeepers.get(rn).checkAnimalCompatibility(animal);
        boolean isAvailable = listOfKeepers.get(rn).available();
        Keeper zk = listOfKeepers.get(rn);
        
        if(isCompatible && isAvailable){
            zk.addAnimal(animal);
            return zk;
        }else{
            return getAvailableZookeeper(animal);
        }
    }
    
    public static ArrayList<Animal> getListOfAnimals() {
        return listOfAnimals;
    }

}
