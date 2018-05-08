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
    Scanner sca = new Scanner(System.in);
    
    private String name;
    private String pet;
    private String dob;
    private String doa;
    private String gender;
    private boolean vaccine;
    private boolean offspring;
    
    
    
    public void add(){
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Pet name: ");
        pet = sc.next();
        System.out.print("Date of birth(dd/mm/yyyy): ");
        dob = sc.next();
        System.out.print("Date of arrival(dd/mm/yyyy): ");
        doa = sc.next();
        System.out.print("Gender(male/female): ");
        gender = sc.next();
        System.out.print("Vaccined(true/false)? ");
        vaccine = sc.nextBoolean();
        System.out.print("Offspring(true/false)? ");
        offspring = sc.nextBoolean();
    }
    
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
                    add();
                    Aquatic a = new Aquatic(); 
                    a.setName(name);
                    a.setPetName(pet);
                    a.setDob(dob);
                    a.setDoa(doa);
                    a.setGender(gender);
                    a.setOffspring(offspring);
                    a.isVaccine();
                    a.isOffspring();
                    setData.listOfAnimals.add(a);
                    a.setKeeper(setData.getAvailableZookeeper(a));
                    printAnimals("AQUATIC");
                    break;
                case 2:
                    add();
                    Avian av = new Avian();
                    av.setName(name);
                    av.setPetName(pet);
                    av.setDob(dob);
                    av.setDoa(doa);
                    av.setGender(gender);
                    av.isVaccine();
                    av.isOffspring();
                    setData.listOfAnimals.add(av);
                    av.setKeeper(setData.getAvailableZookeeper(av));
                    printAnimals("AVIAN");
                    break;
                case 3:
                    add();
                    Insect i = new Insect();
                    i.setName(name);
                    i.setPetName(pet);
                    i.setDob(dob);
                    i.setDoa(doa);
                    i.setGender(gender);
                    i.isOffspring();
                    i.isVaccine();
                    setData.listOfAnimals.add(i);
                    i.setKeeper(setData.getAvailableZookeeper(i));
                    printAnimals("INSECT");
                    break;
                case 4:
                    add();
                    Mammal m = new Mammal();
                    m.setName(name);
                    m.setPetName(pet);
                    m.setDob(dob);
                    m.setDoa(doa);
                    m.setGender(gender);
                    m.isOffspring();
                    m.isVaccine();
                    setData.listOfAnimals.add(m);
                    m.setKeeper(setData.getAvailableZookeeper(m));
                    printAnimals("MAMMAL");
                    break;
                case 5: 
                    add();
                    Reptile r = new Reptile();
                    r.setName(name);
                    r.setPetName(pet);
                    r.setDob(dob);
                    r.setDoa(doa);
                    r.setGender(gender);
                    r.isOffspring();
                    r.isVaccine();
                    setData.listOfAnimals.add(r);
                    r.setKeeper(setData.getAvailableZookeeper(r));
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
            System.out.print("Exhibit Number: " + animal.getExhibitNumber());
            System.out.print(" Name: " + animal.getName());
            System.out.println(" | " + animal.getPetName());
            System.out.println("  Responsible Keeper: " + animal.getKeeper().getName() + "\n");
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
                        search(setData, printOut);
                        break;
                    case 2:
                        printAnimals("AVIAN");
                        search(setData, printOut);
                        break;
                    case 3:
                        printAnimals("INSECT");
                        search(setData, printOut);
                        break;
                    case 4:
                        printAnimals("MAMMAL");
                        search(setData, printOut);
                        break;
                    case 5:
                        printAnimals("REPTILE");
                        search(setData, printOut);
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
    public void search(SetUpDataUtility setData, Printing printOut){
        System.out.println();
        System.out.print("Select animal's exhibit number, from the list above, to see more info: ");
        int id = sc.nextInt();
        Animal a = setData.listOfAnimals.get(id - 1);
        System.out.println();
        System.out.println(a.toString());
        System.out.print("Would you like to keep searching? (y/n)");
        String h = sc.next();
        if (h.equals("y")) {
            System.out.println();
            searchAnimal(setData, printOut);
        }else{
            System.out.println();
        }
    }
    
    public void updateAnimal(SetUpDataUtility setData, Printing printOut){
        System.out.println();
        System.out.println("----Updating Animal----");
        System.out.println("[1] Update Aquatic animals");
        System.out.println("[2] Update Avian animals");
        System.out.println("[3] Update Insect animals");
        System.out.println("[4] Update Mammal animals");
        System.out.println("[5] Update Reptile animals");
        System.out.println("[6] Cancel");
        System.out.println();
        System.out.print("Please select an option from the list above: ");
        int option = sc.nextInt();
        int i = 0;
        
        
        try{
                switch(option){
                    case 1:
                        printAnimals("AQUATIC");
                        System.out.print("Please, select the animal id, from the list above, you would like to update: ");
                        i = sca.nextInt();
                        break;
                    case 2:
                        printAnimals("AVIAN");
                        System.out.print("Please, select the animal id, from the list above, you would like to update: ");
                        i = sca.nextInt();
                        break;
                    case 3:
                        printAnimals("INSECT");
                        System.out.print("Please, select the animal id, from the list above, you would like to update: ");
                        i = sca.nextInt();
                        break;
                    case 4:
                        printAnimals("MAMMAL");
                        System.out.print("Please, select the animal id, from the list above, you would like to update: ");
                        i = sca.nextInt();
                        break;
                    case 5:
                        printAnimals("REPTILE");
                        System.out.print("Please, select the animal id, from the list above, you would like to update: ");
                        i = sca.nextInt();
                        break;
                    case 6:
                        System.out.println();
                        break;
                    default:
                        System.out.println("Please, try again");
                        System.out.println();
                        updateAnimal(setData, printOut);
                }
            }catch(InputMismatchException e){
                System.out.println("Please, try again");
                System.out.println();
                updateAnimal(setData, printOut);
            }
        
            if (option > setData.listOfAnimals.size()) {
            System.out.println();
            System.out.println("please, try again");
            updateAnimal(setData, printOut);
            }else{
                Animal a = setData.listOfAnimals.get(i - 1);
                System.out.println();
                System.out.println(a.toString());
                
            }
    }
}
