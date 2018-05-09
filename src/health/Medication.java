/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package health;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public class Medication {
    
    private String date;
    private String description;
    
    /**
     *
     * @param date
     * @param description
     */
    public Medication(String date, String description){
        this.date = date;
        this.description = description;
    }

    /**
     *
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString(){
        String output = "";
        output += "-----------------------------" + "\n";
        output += "                 |Date: " + date + "\n";
        output += "                 |Description: " + description+ "\n";
        output += "  ----------------------------------------";
        return output;
    }
}
