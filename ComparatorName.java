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

public class ComparatorName implements Comparator<Runner>{


    @Override
    public int compare(Runner r1, Runner r2) {
        return (r1.getName().compareToIgnoreCase(r2.getName())<0) ? -1: (r1.getName().compareToIgnoreCase(r2.getName())>0) ? 1:0 ;  
    }
}
