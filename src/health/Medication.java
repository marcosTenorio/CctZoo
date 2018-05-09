package health;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class Medication {

    private String date;
    private String description;

    public Medication(String date, String description) {
        this.date = date;
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

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
