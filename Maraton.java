/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MaratonPackage;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author krille
 */
public class Maraton {

    private int startNum = 0;
    private RunnersArray runnerList = new RunnersArray();
    private ArrayList<Runner> temp;

    public Maraton() {
        System.out.println("Start..");
        System.out.println("Adding runner to list..");
        newRunner(++startNum, "Kalle Balle", "Sweden", 15);
        newRunner(++startNum, "Kblle Balle", "Sweden", 45);
        newRunner(++startNum, "Aalle Balle", "Sweden", 58);
        newRunner(++startNum, "Arlle Balle", "Sweden", 38);

        runnerList.add(new Runner(++startNum, "Abba", "England", 23, "03:22:01"));
        runnerList.add(new Runner(++startNum, "Rebo", "Finland", 25, "03:22:00"));
        runnerList.add(new Runner(++startNum, "Bbba", "Dengland", 33, "03:21:01"));
        runnerList.add(new Runner(++startNum, "Cbba", "BEngland", 13, "02:22:01"));
        System.out.println(runnerList.toString());


    }

    public void newRunner(int startNumber, String name, String nationality, int age) {
        runnerList.add(new Runner(startNumber, name, nationality, age));
    }

    public ArrayList<Runner> getSortName() {
        temp = new ArrayList<Runner>(runnerList.getRunnerList());
        Collections.sort(temp, new ComparatorName());
        return temp;
    }

    public ArrayList<Runner> getSortAge() {
        temp = new ArrayList<Runner>(runnerList.getRunnerList());
        Collections.sort(temp, new ComparatorAge());
        return temp;
    }

    public ArrayList<Runner> getSortTime() {
        temp = new ArrayList<Runner>(runnerList.getRunnerList());
        Collections.sort(temp, new ComparatorTime());
        return temp;
    }

    public ArrayList<Runner> getRunnersArray() {
        return runnerList.getRunnerList();
    }

    public String toString() {
        return runnerList.toString();
    }
}
