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
        if (r1.getTime().equals("--") && r2.getTime().equals("--")) {
            ComparatorNr c = new ComparatorNr();
            return c.compare(r1, r2);
        } else if (r1.getTime().equals("--")) {
            return 1;
        } else if (r2.getTime().equals("--")) {
            return -1;
        } else {
            return (r1.getTime().compareToIgnoreCase(r2.getTime()) < 0) ? -1 : (r1.getTime().compareToIgnoreCase(r2.getTime()) > 0) ? 1 : 0;
        }
    }
}
