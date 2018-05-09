package animals;

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

    public Animal() {
        animalId = ++lastanimalId;
        medicationList = new ArrayList<>();
    }

    public static ArrayList<Animal> list(String type) {

        ArrayList<Animal> list = new ArrayList<>();

        for (Animal animal : SetUpDataUtility.getListOfAnimals()) {
            if (animal.getType().equals(type)) {
                list.add(animal);
            }
        }
        return list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDoa() {
        return doa;
    }

    public void setDoa(String doa) {
        this.doa = doa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isOffspring() {
        return offspring;
    }

    public void setOffspring(boolean offspring) {
        this.offspring = offspring;
    }

    public int getExhibitNumber() {
        return this.animalId;
    }

    public void setExhibitNumber(int exhibitNumber) {
        this.exhibitNumber = exhibitNumber;
    }

    public ArrayList<Medication> getMedication() {
        return medicationList;
    }

    public void setMedication(Medication medication) {
        this.medicationList.add(medication);
    }

    public boolean isVaccine() {
        return vaccine;
    }

    public void setVaccine(boolean vaccine) {
        this.vaccine = vaccine;
    }

    public SubType getAnimalSubType() {
        return animalSubType;
    }

    public void setAnimalSubType(SubType animalSubType) {
        this.animalSubType = animalSubType;
    }

    public Keeper getKeeper() {
        return keeper;
    }

    public void setKeeper(Keeper keeper) {
        this.keeper = keeper;
    }

    public String getType() {
        String type = this.getClass().getName();
        if (type.contains(".")) {
            type = type.split("\\.")[1];
        }
        return type.toUpperCase();
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void breastFeed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void swim() {
    }

    @Override
    public void layeggs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void metamorphose() {
    }

    @Override
    public void giveBirth() {
    }

    public String getProperties() {
        return "";
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
        String output;
        output = this.getName() + " | Type: " + this.getType();
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
