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
public class ComparatorTime implements Comparator<Runner> {

    @Override
    public int compare(Runner r1, Runner r2) {
        
            return (r1.getTime() < r2.getTime()) ? -1 : (r1.getTime() > r2.getTime()) ? 1 : 0;
        
    }
}
