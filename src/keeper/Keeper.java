
package keeper;

import animals.Animal;
import animals.SubType;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class Keeper extends Person{
    
    private final static int maxAnimals = 10; 
    private final static int maxTypes = 3; 
    private final ArrayList<SubType> canLookAfter;
    private final ArrayList<Animal> listOfAnimals;

    public Keeper(){
        this.canLookAfter = new ArrayList<>();
        this.listOfAnimals = new ArrayList<>();
    }
    
    public Keeper(String firstName, String surName, String dob) {
        this.canLookAfter = new ArrayList<>();
        this.listOfAnimals = new ArrayList<>();
        this.firstName = firstName;
        this.surName = surName;
        this.dob = dob;        
    }
    
    public void addAnimal(Animal animal){
        if(checkAnimalCompatibility(animal)){
            if(canLookAfter.size() < maxAnimals){
                boolean add = listOfAnimals.add(animal);
            }
        }
    }
    
    public boolean available(){
        return 10 >= listOfAnimals.size();
    }
    
    public boolean checkAnimalCompatibility(Animal animal){
        try {
            if (canLookAfter.stream().anyMatch((item) -> (
                item.toString().equals(animal.getType())
                        ||
                 item.toString().equals(animal.getAnimalSubType().toString())
            ))) {
                return true;
            }
                
        } catch (Exception e) {
            //TODO:
        }
        
        return false;
    }
    
    public String getName() {
        return firstName + " " + surName;
    }
    
    public void setName(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getSurName() {
        return surName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setSurName(String firstName) {
        this.firstName = firstName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    private boolean isTypeOnList(SubType type){
        return canLookAfter.stream().anyMatch((item) -> (item.equals(type)));
    }

    public void addAnimalType(SubType subType) {
        
        if(isTypeOnList(subType)){
            return;
        }
        if(canLookAfter.size() < maxTypes){
            canLookAfter.add(subType);
        }
    }
    
    @Override
    public String toString() {
        String output = "";
        output += "Keeper: " + getName() + " | Date of birth: " + dob + "\n";
        output += "  Qualifications: ";
        
        for (SubType qf : canLookAfter) {
            output += "  " + qf + " | ";
        }
        
        output += "\n  List of animals:\n";
        for (Animal animal : listOfAnimals) {
            output += "    " + animal.getExhibitNumber() + " | " + animal.getName() + " | " + animal.getPetName() + "\n";
        }
        
        return output;
    }
}
