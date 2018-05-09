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
     * this method controls the max types and total animals each keeper is able
     * to look after
     */
    public Keeper() {
        this.canLookAfter = new ArrayList<>();
        this.listOfAnimals = new ArrayList<>();
    }

    /**
     * Retrieve the first name of the Keeper, Retrieve the surname of the
     * Keeper, Retrieve the date of birth of the Keeper
     *
     * @param firstName variable of type String
     * @param surName variable of type String
     * @param dob variable of type String
     */
    public Keeper(String firstName, String surName, String dob) {
        this.canLookAfter = new ArrayList<>();
        this.listOfAnimals = new ArrayList<>();
        this.firstName = firstName;
        this.surName = surName;
        this.dob = dob;
    }

    /**
     * Retrieve a specific animal and look for an available Keeper
     *
     * @param animal variable of type Animal
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
     * method checks the availability of the keeper
     *
     * @return a variable of type boolean
     */
    public boolean available() {
        return 10 >= listOfAnimals.size();
    }

    /**
     * method checks Keeper allowance to look after a determined type and sub
     * type of an animal
     *
     * @param animal variable of type Animal
     * @return a variable of type boolean
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
     * Retrieve the Keeper full name
     *
     * @return a String data type
     */
    public String getName() {
        return firstName + " " + surName;
    }

    /**
     * Set the first and surname of the Keeper
     *
     * @param firstName a variable of type String
     * @param surName a variable of type String
     */
    public void setName(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    /**
     * Retrieve the keeper first name
     *
     * @return a String data type
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Retrieve the surname of the Keeper
     *
     * @return a String data type
     */
    public String getSurName() {
        return surName;
    }

    /**
     * Set the first name of the Keeper
     *
     * @param firstName a variable of type String
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Set the surname of the Keeper
     *
     * @param surname a variable of type String
     */
    public void setSurName(String surname) {
        this.surName = surname;
    }

    /**
     * Retrieve the date of birth of the Keeper
     *
     * @return a String data type
     */
    public String getDob() {
        return dob;
    }

    /**
     * Set the date of birth of the Keeper
     *
     * @param dob a variable of type String
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * method check if the keeper is allow to look after of determined animal
     * sub type
     *
     * @param type a variable of type SubType
     * @return a boolean data type
     * @seeSubType
     */
    private boolean isTypeOnList(SubType type) {
        return canLookAfter.stream().anyMatch((item) -> (item.equals(type)));
    }

    /**
     * compare the sub type and keeper availability, if result is positive add
     * the animal to the Keeper list
     *
     * @param subType the sub types of animals(AQUACTIC, AVIAN, INSECT, MAMMAL,
     * REPTILE)
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
