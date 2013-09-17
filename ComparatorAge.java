/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MaratonPackage;

/**
 *
 * @author krille
 */
import java.util.Comparator;

public class ComparatorAge implements Comparator<Runner>{


    @Override
    public int compare(Runner r1, Runner r2) {
        return (r1.getAge() < r2.getAge() ) ? -1: (r1.getAge() > r2.getAge() ) ? 1:0 ;  
    }
}

