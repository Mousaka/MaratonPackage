/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MaratonPackage;

import java.util.ArrayList;

/**
 *
 * @author krille
 */
public class RunnersArray{
    private ArrayList<Runner> runnerList;

    public ArrayList<Runner> getRunnerList() {
        return runnerList;
    }
    public RunnersArray() {
        runnerList = new ArrayList<Runner>();
    }
    
    public void add(Runner r){
        runnerList.add(r);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Runner r : runnerList){
            sb.append(r.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
