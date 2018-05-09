
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

    /**
     *
     */
    public Keeper(){
        this.canLookAfter = new ArrayList<>();
        this.listOfAnimals = new ArrayList<>();
    }
    
    /**
     *
     * @param firstName
     * @param surName
     * @param dob
     */
    public Keeper(String firstName, String surName, String dob) {
        this.canLookAfter = new ArrayList<>();
        this.listOfAnimals = new ArrayList<>();
        this.firstName = firstName;
        this.surName = surName;
        this.dob = dob;        
    }
    
    /**
     *
     * @param animal
     */
    public void addAnimal(Animal animal){
        if(checkAnimalCompatibility(animal)){
            if(canLookAfter.size() < maxAnimals){
                boolean add = listOfAnimals.add(animal);
            }
        }
    }
    
    /**
     *
     * @return
     */
    public boolean available(){
        return 10 >= listOfAnimals.size();
    }
    
    /**
     *
     * @param animal
     * @return
     */
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
    
    /**
     *
     * @return
     */
    public String getName() {
        return firstName + " " + surName;
    }
    
    /**
     *
     * @param firstName
     * @param surName
     */
    public void setName(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }
    
    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     *
     * @return
     */
    public String getSurName() {
        return surName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     *
     * @param firstName
     */
    public void setSurName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getDob() {
        return dob;
    }

    /**
     *
     * @param dob
     */
    public void setDob(String dob) {
        this.dob = dob;
    }
    
    private boolean isTypeOnList(SubType type){
        return canLookAfter.stream().anyMatch((item) -> (item.equals(type)));
    }

    /**
     *
     * @param subType
     */
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
