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
    public static int lastanimalId = 0;

    private String name;
    private String petName;
    private String dob;
    private String doa;
    private String gender;
    private boolean offspring;
    //protected ArrayList<Medication> medication = new ArrayList<>();
    private boolean vaccine;
    private int exhibitNumber;
    private Keeper keeper;
    private SubType animalSubType;
    private Medication Medication;
    
    public Animal() {
        animalId = ++lastanimalId;
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

    public Medication getMedication() {
        return Medication;
    }

    public void setMedication(Medication Medication) {
        this.Medication = Medication;
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
        //String subtype = getSubtype() == null ? "Undefined" : this.getSubtype().toString();
        output = this.getName() + " | Type: " + this.getType();
        //TODO + " | Subtype: " + subtype + " ----\n";
        output += "  Exhibit Number: " + this.getExhibitNumber() + "\n";
        output += "  Date of Birth: " + this.getDob() + " | Gender: " + this.gender + "\n";
        output += "  Date of Arrival: " + this.doa + "\n";
        output += "  Offspring: " + this.offspring + "\n";
        output += "  Vaccined: " + this.vaccine + "\n";
        output += "  Medication: " + this.getMedication() + "\n";
        output += "  Zookeeper: " + this.keeper.getName() + "\n";
        output += this.getProperties();
        return output;
    }
}
