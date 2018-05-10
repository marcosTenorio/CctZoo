package animals.interfaces;

/**
 * @author Marcus
 * @author Gabriel Oliveira
 */
public interface ICheckType {

    /**
     * Method has to be implemented whenever an animal executes one action from
     * any other interface, it has to check if animal IS an instance of the class
     * or if it IS a subtype of the class
     * If an aquatic tries to fly, it has to have the interface IFly implemented and it
     * has to be the subtype of Avian
     */
    public void checkAnimalType();
}
