
package keeper;



/**
 *
 * @author marcos
 */
public class Keeper extends Person{

    public Keeper(){}
    
    public Keeper(String name, String dob) {
        this.name = name;
        this.dob = dob;        
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
    
    
    
    
    
    
}
