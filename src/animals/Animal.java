
package animals;

import animals.health.Medication;
import animals.interfaces.IAquatic;
import animals.interfaces.IAvian;
import animals.interfaces.IInsect;
import animals.interfaces.IMammal;
import animals.interfaces.IReptile;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import keeper.Keeper;
import setuphelper.SetUpDataUtility;
import setuphelper.StoredDataUtility;
/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public abstract class Animal implements IAquatic, IAvian, IInsect, IMammal, IReptile{

    private final int animalId;
    public static int lastanimalId = 0;

    private String name;
    private String dob;
    private String doa;
    private char gender;
    private boolean offspring;
    private ArrayList<Medication> medication = new ArrayList<>();
    private ArrayList<Medication> vaccine = new ArrayList<>();
    private int exhibitNumber;
    private Keeper keeper;
    private SubType animalSubType;

    public Animal(){
         animalId = ++lastanimalId;
    }

    
    public static ArrayList<Animal> list (String type){
        
        ArrayList<Animal> list = new ArrayList<>();
        
        for (Animal animal : SetUpDataUtility.getListOfAnimals()){
            if(animal.getType().equals(type)){
                list.add(animal);
                System.out.print("ID: " + animal.getExhibitNumber());
                System.out.println(" Name: " + animal.getName());
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
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
        return medication;
    }

    public void setMedication(ArrayList<Medication> medication) {
        this.medication = medication;
    }

    public ArrayList<Medication> getVaccine() {
        return vaccine;
    }

    public void setVaccine(ArrayList<Medication> vaccine) {
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

    public String getType(){

        String type = this.getClass().getName();

        if(type.contains(".")){
            type = type.split("\\.")[1];
        }
        return type;
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
    public void swim(){

    }

    @Override
    public void layeggs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void metamorphose(){

    }
    
    @Override
    public void giveBirth(){
        
    }
    
    public String getProperties(){
        return "";
    }

    @Override
    public String toString(){
        String output;
        //String subtype = getSubtype() == null ? "Undefined" : this.getSubtype().toString();
        output = this.getName() + " | Type: " + this.getType();
        //TODO + " | Subtype: " + subtype + " ----\n";
        output += "  Exibit Number: " + this.exhibitNumber + "\n";
        output += "  Date of Birth: " + this.dob + " | Gender: " + this.gender + "\n";
        output += "  Date of Arrival: " + this.doa + "\n";
        output += "  Vaccine: " + this.vaccine + " | Medication:" + this.medication + "\n";
        //output += "  Offspring: " + this.offSpring + "\n";
        //output += "  Zookeeper: " + this.zookeeper + "\n";
        output += this.getProperties();
        return output;
    }
}
