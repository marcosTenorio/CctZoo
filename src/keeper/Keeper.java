
package keeper;



/**
 *
 * @author marcos
 */
public class Keeper extends Person{

    public Keeper(){}
    
    public Keeper(String firstName, String surName, String dob) {
        this.firstName = firstName;
        this.surName = surName;
        this.dob = dob;        
    }
    
    public String getName() {
        return firstName + " " + surName;
    }
    
    public void setName(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getSurName() {
        return surName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setSurName(String firstName) {
        this.firstName = firstName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    @Override
    public String toString() {
        return "---------------------- \n"
                + "Keeper: " + getName() +"\n"
                + "Date of birth = "+dob +"\n"
                + "------------------";                
    }
}
