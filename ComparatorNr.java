/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MaratonPackage;

import java.util.Comparator;

/**
 *
 * @author krille
 */
public class ComparatorNr implements Comparator<Runner>{


    @Override
    public int compare(Runner r1, Runner r2) {
        return (r1.getStartNumber() < r2.getStartNumber() ) ? -1: (r1.getStartNumber() > r2.getStartNumber() ) ? 1:0 ;  
    }
}
