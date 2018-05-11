package animals;

import health.Medication;
import animals.interfaces.IAquatic;
import animals.interfaces.IAvian;
import animals.interfaces.IInsect;
import animals.interfaces.IMammal;
import animals.interfaces.IReptile;
import java.util.ArrayList;
import keeper.Keeper;
import setuphelper.SetUpDataUtility;
import health.Medication;
import setuphelper.StoredDataUtility;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public abstract class Animal implements IAquatic, IAvian, IInsect, IMammal, IReptile {

    private final int animalId;

    /**
     * Keeps track of the amount of animals that have been created
     * during the program lifetime
     */
    public static int lastanimalId = 0;

    private String name;
    private String petName;
    private String dob;
    private String doa;
    private String gender;
    private boolean offspring;
    private boolean vaccine;
    private int exhibitNumber;
    private Keeper keeper;
    private SubType animalSubType;
    private ArrayList<Medication> medicationList;
    private boolean isSwimming;
    private boolean isFlying;
    private boolean isBreastFeeding;

    /**
     * Initializes a newly created Animal object so that it represents an empty Animal.
     */
    public Animal() {
        animalId = ++lastanimalId;
        medicationList = new ArrayList<>();
    }

    /**
     * Returns the list of animals based on a type specified.
     * @param type The type of the animal
     * @return An ArrayList of filtered animals based on a type specified
     * @see ArrayList
     * @see SubType
     */
    public static ArrayList<Animal> list(String type) {

        ArrayList<Animal> list = new ArrayList<>();

        for (Animal animal : SetUpDataUtility.getListOfAnimals()) {
            if (animal.getType().equals(type)) {
                list.add(animal);
            }
        }
        return list;
    }

    /**
     * Returns the Animal name.
     * @return A String containing the Animal name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the Animal name
     * @param name A String name for the animal
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the date of birth of the Animal
     * @return String containing the date of birth of the Animal
     */
    public String getDob() {
        return dob;
    }

    /**
     * Sets the animal date of birth
     * @param dob A String containing the Animal date of birth in the format MM/DD/AAAA
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * Returns the Animal date of Arrival
     * @return A String containing the data of arrival of the Animal in the format MM/DD/AAAA
     */
    public String getDoa() {
        return doa;
    }

    /**
     * Sets the animal date of arrival
     * @param doa A String containing the Animal date of arrival in the format MM/DD/AAAA
     */
    public void setDoa(String doa) {
        this.doa = doa;
    }

    /**
     * Returns the gender of the animal
     * @return A String containing male | female
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the Animal
     * @param gender A String containing either male or female
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Returns if animal has offspring
     * @return A boolean defining if Animal has offspring or not
     */
    public boolean isOffspring() {
        return offspring;
    }

    /**
     * Sets the value of the offspring variable
     * @param offspring A boolean to set the Animal offspring
     */
    public void setOffspring(boolean offspring) {
        if(!this.offspring){
          this.offspring = offspring;
        }
    }

    /**
     * Returns the Animal exhibit number
     * @return An integer containing the Animal exhibit number
     */
    public int getExhibitNumber() {
        return this.animalId;
    }

    /**
     * Returns an ArrayList with the Animal's medication
     * @return An ArrayList of Medication with the Animal's medication
     * @see Medication
     */
    public ArrayList<Medication> getMedication() {
        return medicationList;
    }

    /**
     * Adds a new medication to the animal
     * @param medication Object of class Medication
     * @see Medication
     */
    public void setMedication(Medication medication) {
        this.medicationList.add(medication);
    }

    /**
     * Return a boolean with the value of Animal's vaccine
     * If animal has been vaccinated it returns true, if not, false
     * @return A boolean with the value of vaccine
     */
    public boolean isVaccine() {
        return vaccine;
    }

    /**
     * Sets the value of vaccine as boolean
     * @param vaccine A boolean setting the value of vaccine
     */
    public void setVaccine(boolean vaccine) {
        this.vaccine = vaccine;
    }

    /**
     * Returns the Subtype of the animal
     * @return An object of the enum class SubType
     * @see SubType
     */
    public SubType getAnimalSubType() {
        return animalSubType;
    }

    /**
     * Sets the value of the variable animalSubType
     * @param animalSubType An enum object of the class SubType
     * @see SubType
     */
    public void setAnimalSubType(SubType animalSubType) {
        this.animalSubType = animalSubType;
    }

    /**
     * Returns the Keeper that looks after this actual Animal
     * @return An object of the class Keeper
     */
    public Keeper getKeeper() {
        return keeper;
    }

    /**
     * Links a Keeper to the Animal
     * @param keeper An Object of the Class Keeper
     * @see Keeper
     */
    public void setKeeper(Keeper keeper) {
        this.keeper = keeper;
    }

    /**
     * Returns the runtime class of this Object
     * Checks the class info of the instance and returns just the
     * relevant part of it
     * @return A String containing the Class name of the current object
     * @see Object#getClass()
     */
    public String getType() {
        String type = this.getClass().getName();
        if (type.contains(".")) {
            type = type.split("\\.")[1];
        }
        return type.toUpperCase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void fly() {
        if(checkAnimalType(this, SubType.AVIAN)){
            isFlying = true;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void stopFlying() {
        if(checkAnimalType(this, SubType.AVIAN)){
            isFlying = false;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void breastFeed() {
        if(checkAnimalType(this, SubType.MAMMAL) && gender.toLowerCase().equals("male") && offspring == true){
            isBreastFeeding = true;
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void stopBreastFeeding() {
        if(checkAnimalType(this, SubType.MAMMAL) && gender.toLowerCase().equals("male") && offspring == true){
            isBreastFeeding = false;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void swim() {
        if(checkAnimalType(this, SubType.AQUATIC)){
            isSwimming = true;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void stopSwimming() {
        if(checkAnimalType(this, SubType.AQUATIC)){
            isSwimming = false;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void layeggs() {
        if(checkAnimalType(this, SubType.REPTILE)){
            offspring = true;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void metamorphose() {
        if(checkAnimalType(this, SubType.INSECT)){
            Animal insect = (Insect)this;
            insect.setMorphed(true);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void giveBirth() {
    }

    /**
     * Sets a method to be overridden by subclasses
     * When overridden, method should return a String with unique properties
     * of subclasses of the class Animal, this method will be used by the toString
     * @return String containing the unique properties of subclass
     */
    public String getProperties() {
        return "";
    }

    /**
     * Returns the Animal pet name
     * @return String with a pet name
     */
    public String getPetName() {
        return petName;
    }

    /**
     * Sets the value of the pet name
     * @param petName A String containing the pet name
     */
    public void setPetName(String petName) {
        this.petName = petName;
    }
    
    /**
     * {@inheritDoc}
     * @param animal
     * @param expectedType
     */
    @Override
    public boolean checkAnimalType(Animal animal, SubType expectedType) {
      //System.out.println("TYpe: " + type + " SubType: " + subtype);
      String type = animal.getType();
      String subType = animal.getAnimalSubType().toString();
      boolean isCompatible = type.equals(expectedType.toString()) || subType.equals(expectedType.toString());
      
      System.out.println("Type: " + type + "  ||  " + subType + "  ||  " + expectedType.toString() + " isCompatible: " + isCompatible);
      
      return isCompatible;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        String output;
        //String subtype = getSubtype() == null ? "Undefined" : this.getSubtype().toString();
        output = this.getName() + " | Type: " + this.getType();
        //TODO + " | Subtype: " + subtype + " ----\n";
        output += "  Exhibit Number: " + this.getExhibitNumber() + "\n";
        output += "  Date of Birth: " + this.getDob() + " | Gender: " + this.gender + "\n";
        output += "  Date of Arrival: " + this.doa + "\n";
        output += "  Offspring: " + this.offspring + "\n";
        output += "  Vaccined: " + this.vaccine + "\n";
        output += "  Medication:\n";

        for (Medication medication : medicationList) {
            output += "    Date: " + medication.getDate() + "\n";
            output += "    Description: " + medication.getDescription() + "\n";
        }

        output += "  Zookeeper: " + this.keeper.getName() + "\n";
        output += this.getProperties();
        return output;
    }
}
