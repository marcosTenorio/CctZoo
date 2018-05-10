package health;

import animals.Animal;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class Medication {

    private String date;
    private String description;

    /**
     * Method to store the date and description of the animal
     * medication 
     *
     * @param date the date the medicine has been given to the animal
     * @param description describes what procedures have been made
     * @see Animal
     */
    public Medication(String date, String description) {
        this.date = date;
        this.description = description;
    }

    /**
     * @return the date the medicine has been given to the animal
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date the medicine has been given to the animal
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the description of what procedures have been made
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description describes what procedures have been made
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        String output = "";
        output += "-----------------------------" + "\n";
        output += "                 |Date: " + date + "\n";
        output += "                 |Description: " + description + "\n";
        output += "  ----------------------------------------";
        return output;
    }
}
