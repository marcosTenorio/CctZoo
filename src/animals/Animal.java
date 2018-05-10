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
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @return
     */
    public boolean isOffspring() {
        return offspring;
    }

    /**
     *
     * @param offspring
     */
    public void setOffspring(boolean offspring) {
        this.offspring = offspring;
    }

    /**
     *
     * @return
     */
    public int getExhibitNumber() {
        return this.animalId;
    }

    /**
     *
     * @param exhibitNumber
     */
    public void setExhibitNumber(int exhibitNumber) {
        this.exhibitNumber = exhibitNumber;
    }

    /**
     *
     * @return
     */
    public ArrayList<Medication> getMedication() {
        return medicationList;
    }

    /**
     *
     * @param medication
     */
    public void setMedication(Medication medication) {
        this.medicationList.add(medication);
    }

    /**
     *
     * @return
     */
    public boolean isVaccine() {
        return vaccine;
    }

    /**
     *
     * @param vaccine
     */
    public void setVaccine(boolean vaccine) {
        this.vaccine = vaccine;
    }

    /**
     *
     * @return
     */
    public SubType getAnimalSubType() {
        return animalSubType;
    }

    /**
     *
     * @param animalSubType
     */
    public void setAnimalSubType(SubType animalSubType) {
        this.animalSubType = animalSubType;
    }

    /**
     *
     * @return
     */
    public Keeper getKeeper() {
        return keeper;
    }

    /**
     *
     * @param keeper
     */
    public void setKeeper(Keeper keeper) {
        this.keeper = keeper;
    }

    /**
     *
     * @return
     */
    public String getType() {
        String type = this.getClass().getName();
        if (type.contains(".")) {
            type = type.split("\\.")[1];
        }
        return type.toUpperCase();
    }
    
    /**
     *
     */
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    @Override
    public void breastFeed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    @Override
    public void swim() {
    }

    /**
     *
     */
    @Override
    public void layeggs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    @Override
    public void metamorphose() {
    }

    /**
     *
     */
    @Override
    public void giveBirth() {
    }

    /**
     *
     * @return
     */
    public String getProperties() {
        return "";
    }

    /**
     *
     * @return
     */
    public String getPetName() {
        return petName;
    }

    /**
     *
     * @param petName
     */
    public void setPetName(String petName) {
        this.petName = petName;
    }
    
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

        /**/
        for (Medication medication : medicationList) {
            output += "    Date: " + medication.getDate() + "\n";
            output += "    Description: " + medication.getDescription() + "\n";
        }
        /**/
        
        output += "  Zookeeper: " + this.keeper.getName() + "\n";
        output += this.getProperties();
        return output;
    }
}
