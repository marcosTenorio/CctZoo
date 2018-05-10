package keeper;

import animals.Animal;
import animals.Aquatic;
import animals.Avian;
import animals.Insect;
import animals.Mammal;
import animals.Reptile;
import animals.SubType;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class Keeper extends Person {

    private final static int maxAnimals = 10;
    private final static int maxTypes = 3;
    private final ArrayList<SubType> canLookAfter;
    private final ArrayList<Animal> listOfAnimals;

    /**
     * method controls the maximum types and animals each keeper is able
     * to look after
     */
    public Keeper() {
        this.canLookAfter = new ArrayList<>();
        this.listOfAnimals = new ArrayList<>();
    }

    /**
     * @param firstName the keeper first name 
     * @param surName the keeper surname
     * @param dob the keeper date of birth
     */
    public Keeper(String firstName, String surName, String dob) {
        this.canLookAfter = new ArrayList<>();
        this.listOfAnimals = new ArrayList<>();
        this.firstName = firstName;
        this.surName = surName;
        this.dob = dob;
    }

    /**
     * @param animal the animal
     * @see Animal
     */
    public void addAnimal(Animal animal) {
        if (checkAnimalCompatibility(animal)) {
            if (canLookAfter.size() < maxAnimals) {
                boolean add = listOfAnimals.add(animal);
            }
        }
    }

    /**
     * @return the result of keeper availability 
     */
    public boolean available() {
        return 10 >= listOfAnimals.size();
    }

    /**
     * @param animal the animal
     * @return the result of keeper and animal compatibility
     */
    public boolean checkAnimalCompatibility(Animal animal) {
        try {
            if (canLookAfter.stream().anyMatch((item) -> (item.toString().equals(animal.getType())
                    || item.toString().equals(animal.getAnimalSubType().toString())))) {
                return true;
            }
        } catch (Exception e) {
        }

        return false;
    }

    /**
     * @return the keeper name
     */
    public String getName() {
        return firstName + " " + surName;
    }

    /**
     * @param firstName the keeper first name
     * @param surName the keeper surname
     */
    public void setName(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    /**
     * @return keeper first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return keeper surname
     */
    public String getSurName() {
        return surName;
    }

    /**
     * @param firstName the keeper first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param surname the keeper surname
     */
    public void setSurName(String surname) {
        this.surName = surname;
    }

    /**
     * @return keeper date of birth
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the keeper date of birth
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * method checks if the keeper is allow to look after of determined animal
     * sub type
     *
     * @param type the type of animal
     * @return the result if the keeper can or can not look after the type of animal 
     * @seeSubType
     */
    private boolean isTypeOnList(SubType type) {
        return canLookAfter.stream().anyMatch((item) -> (item.equals(type)));
    }

    /**
     * compare the sub type and keeper availability, if result is positive,
     * add the animal to the Keeper list
     *
     * @param subType the sub types of animal
     * @see Aquatic
     * @see Avian
     * @see Insect
     * @see Mammal
     * @see Reptile
     */
    public void addAnimalType(SubType subType) {

        if (isTypeOnList(subType)) {
            return;
        }
        if (canLookAfter.size() < maxTypes) {
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
