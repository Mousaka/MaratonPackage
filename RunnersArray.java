/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MaratonPackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author krille
 */
public class RunnersArray {

    private ArrayList<Runner> runnerList;
   // private ArrayList<Runner> listSortAge;

    public ArrayList<Runner> getRunnerList() {
        return runnerList;
    }
    
    public void addTime(int startnr, double time){
        runnerList.get(startnr-1).setTime(time);
    }
    public RunnersArray() {
        runnerList = new ArrayList<Runner>();
    }
/*
 * Påbörjat sortInsert nedan
 */
  /*
    public void sortInsertAge(Runner r) {
        int length = listSortAge.size();
        int mid = length / 2;
        int age;
        int ageBig;
        int ageSmall;
        
        age = listSortAge.get(mid).getAge();
        ageBig = listSortAge.get(length-1).getAge();
        ageSmall = listSortAge.get(mid/2).getAge();
        
        if (age == r.getAge()) {
            listSortAge.add(mid, r);
        } else if(r.getAge() < listSortAge.get(mid+1).getAge() && r.getAge() > listSortAge.get(mid-1).getAge() ){ //Sweet spot
            listSortAge.add(mid, r);
        }
        else if (ageBig > r.getAge() && ageSmall < r.getAge()) {
            mid = mid + (mid / 2);
        } else if (ageSmall > r.getAge()) {
            mid = mid-(mid/2);
            ageSmall = ageBig;
            
        }

        while (true) {
            ageBig = listSortAge.get(mid).getAge();
            if (ageBig > r.getAge()) {
                mid = mid / 2;
            } else if (ageBig < r.getAge()) {
                mid = mid + (mid / 2);
            } else if (ageBig == r.getAge()) {
                listSortAge.add(r);
                Collections.swap(listSortAge, mid, listSortAge.size() - 1);
                break;
            }

        }
    }
*/
    public void add(Runner r) {
        runnerList.add(r);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Runner r : runnerList) {
            sb.append(r.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
