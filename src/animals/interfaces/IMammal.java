package animals.interfaces;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public interface IMammal extends ICheckType{

    /**
     * Changes the variable breastFeeding value to true
     */
    public void breastFeed();
    
    /**
     * Changes the variable breastFeeding value to false
     */
    public void stopBreastFeeding();

    /**
     * Changes the variable offspring value to false
     * Method has to check if gender == female in order to run
     */
    public void giveBirth();
}
