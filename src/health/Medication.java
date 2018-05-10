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
     * This method is used to store the date and description of the animal
     * medication Retrieve the date of the medication Retrieve description of
     * the medication
     *
     * @param date variable of type String
     * @param description variable of type String
     * @see Animal
     */
    public Medication(String date, String description) {
        this.date = date;
        this.description = description;
    }

    /**
     * Retrieve the date of the medication
     *
     * @return a String data type
     */
    public String getDate() {
        return date;
    }

    /**
     * Set the medication date
     *
     * @param date a variable of type String
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Retrieve the description of the medication
     *
     * @return a String data type
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description of the medication
     *
     * @param description a variable of type String
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
