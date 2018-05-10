package animals.interfaces;

/**
 *
 * @author Marcos
 * @author Gabriel Oliveira
 */
public interface IAquatic extends ICheckType{

    /**
     * This interface when implemented, gives the ability to an Animal to be a
     * subtype of animal, becoming its first type, and an Aquatic as well
     */
    
    /**
     * Changes the variable swimming value to true
     */
    public void swim();
    
    /**
     * Changes the variable swimming value to false
     */
    public void stopSwimming();
}
