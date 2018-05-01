package types;

/**
 *
 * @author marcos
 */
public abstract class Animal {
    protected String dob;
    protected String dateOfArrival;
    protected String gender;
    protected String offspring;
    protected String medication;
    protected String vaccined;
    protected int exhibitNumber;
    
    public Animal(){
        
    }

    public String getDob() {
        return dob;
    }
    
    
    
}
