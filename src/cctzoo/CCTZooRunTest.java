package cctzoo;

import animals.Mammal;
import animals.SubType;

/**
 *
 * @author Gabriel Oliveira
 */
public class CCTZooRunTest {
    public static void main(String[] args){
        Mammal mm = new Mammal();
        mm.setAnimalSubType(SubType.AVIAN);
        
        mm.fly();
    }
}
