package animals;

import health.Medication;
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
    
    
    
    /**
     *
     * @param setData
     * @param printOut
     */
    public void addAnimal(SetUpDataUtility setData, Printing printOut) {
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

        try {
            switch (option) {
                case 1:
                    //TODO remove redundancy of the add method being called multiple times on the same scope
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
                    printOut.printAnimals(setData, "AQUATIC");
                    System.out.println("Animal added successfully!");
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
                    printOut.printAnimals(setData, "AVIAN");
                    System.out.println("Animal added successfully!");
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
                    printOut.printAnimals(setData, "INSECT");
                    System.out.println("Animal added successfully!");
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
                    printOut.printAnimals(setData, "MAMMAL");
                    System.out.println("Animal added successfully!");
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
                    printOut.printAnimals(setData, "REPTILE");
                    System.out.println("Animal added successfully!");
                    break;
                case 6:
                    System.out.println();
                    break;
                default:
                    System.out.println("Please, try again");
                    System.out.println();
                    addAnimal(setData, printOut);
            }
        } catch (InputMismatchException e) {
            System.out.println("Please, try again");
            System.out.println();
            addAnimal(setData, printOut);
        }
    }
    
    /**
     *
     */
    public void add() {
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
    
    /**
     *
     * @param setData
     * @param printOut
     */
    public void searchAnimal(SetUpDataUtility setData, Printing printOut) {
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

        try {
            switch (option) {
                case 1:
                    printOut.printAnimals(setData, "AQUATIC");
                    search(setData, printOut);
                    break;
                case 2:
                    printOut.printAnimals(setData, "AVIAN");
                    search(setData, printOut);
                    break;
                case 3:
                    printOut.printAnimals(setData, "INSECT");
                    search(setData, printOut);
                    break;
                case 4:
                    printOut.printAnimals(setData, "MAMMAL");
                    search(setData, printOut);
                    break;
                case 5:
                    printOut.printAnimals(setData, "REPTILE");
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
        } catch (InputMismatchException e) {
            System.out.println("Please, try again");
            System.out.println();
            searchAnimal(setData, printOut);
        }
    }
    
    /**
     *
     * @param setData
     * @param printOut
     */
    public void search(SetUpDataUtility setData, Printing printOut) {
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
        } else {
            System.out.println();
        }
    }
    
    /**
     *
     * @param setData
     * @param printOut
     */
    public void updateAnimal(SetUpDataUtility setData, Printing printOut) {
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

        try {
            switch (option) {
                case 1:
                    printOut.printAnimals(setData, "AQUATIC");
                    update(setData, printOut);
                    break;
                case 2:
                    printOut.printAnimals(setData, "AVIAN");
                    update(setData, printOut);
                    break;
                case 3:
                    printOut.printAnimals(setData, "INSECT");
                    update(setData, printOut);
                    break;
                case 4:
                    printOut.printAnimals(setData, "MAMMAL");
                    update(setData, printOut);
                    break;
                case 5:
                    printOut.printAnimals(setData, "REPTILE");
                    update(setData, printOut);
                    break;
                case 6:
                    System.out.println();
                    break;
                default:
                    System.out.println("Please, try again");
                    System.out.println();
                    updateAnimal(setData, printOut);
            }
        } catch (InputMismatchException e) {
            System.out.println("Please, try again");
            System.out.println();
            updateAnimal(setData, printOut);
        }
    }
    
    /**
     *
     * @param setData
     * @param printOut
     */
    public void update(SetUpDataUtility setData, Printing printOut) {
        System.out.print("Please, select the animal id, from the list above, you would like to update: ");
        int option = sc.nextInt();
        System.out.println();

        if (option > setData.listOfAnimals.size()) {
            System.out.println();
            System.out.println("please, try again");
            updateAnimal(setData, printOut);
        } else {
            Animal a = setData.listOfAnimals.get(option - 1);
            System.out.println();
            System.out.println(a.toString());
            System.out.println();
            System.out.println("[1] Update data");
            System.out.println("[2] Add new medication");
            System.out.println("[3] Cancel");
            System.out.println();
            System.out.print("Please select an option from the list above: ");
            int i = sc.nextInt();

            try {
                switch (i) {
                    case 1:
                        updateData(a, setData, printOut);
                        System.out.println();
                        break;
                    case 2:
                        medication(a, setData, printOut);
                        System.out.println();
                        break;
                    case 3:
                        System.out.println();
                        break;
                    default:
                        System.out.println("Error, please try again");
                        System.out.println();
                        updateAnimal(setData, printOut);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, please try again");
                System.out.println();
                updateAnimal(setData, printOut);
            }
        }
    }
    
    /**
     *
     * @param a
     * @param setData
     * @param printOut
     */
    public void updateData(Animal a, SetUpDataUtility setData, Printing printOut) {
        System.out.println();
        System.out.print("Name: ");
        String name = sc.next();
        a.setName(name);
        System.out.print("Pet name: ");
        String pet = sc.next();
        a.setPetName(pet);
        System.out.print("Date of birth(dd/mm/yyyy): ");
        String dob = sc.next();
        a.setDob(dob);
        System.out.print("Data of arrival(dd/mm/yyyy): ");
        String doa = sc.next();
        a.setDoa(doa);
        System.out.print("Gender(male/female): ");
        String g = sc.next();
        a.setDoa(doa);
        System.out.print("Offspring(true/false)?  ");
        boolean o = sc.nextBoolean();
        a.setOffspring(offspring);
        System.out.print("Vaccined(true/false)? ");
        boolean v = sc.nextBoolean();
        System.out.println();
        System.out.println("Animal updated successfully!");
        System.out.println();
        System.out.print("Would you like to update more animlas(y/n)");
        String x = sc.next();
        if (x.equals("y")) {
            updateAnimal(setData, printOut);
        } else {
            System.out.println();
        }
    }
     /**
     *
     * @param a
     * @param setData
     * @param printOut
     */
    public void medication(Animal a, SetUpDataUtility setData, Printing printOut) {
        System.out.println();
        System.out.print("date(dd/mm/yyyy): ");
        String date = sc.next();
        System.out.print("description: ");
        String desc = sc.next();
        Medication m = new Medication(date, desc);
        System.out.println();
        a.setMedication(m);
        System.out.println(a.toString());
        System.out.print("Would you like to update other animal?(y/n) ");
        String option = sc.next();
        if (option.equals("y")) {
            updateAnimal(setData, printOut);
        } else {
            System.out.println();
        }

    }
}
