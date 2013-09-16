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

public class Maraton {
   private int startNum = 0;
   private RunnersArray runnerList = new RunnersArray();
   public Maraton(){
       System.out.println("Start..");
       System.out.println("Adding runner to list..");
       newRunner(++startNum, "Kalle Balle", "Sweden", 18);
       newRunner(++startNum, "Kalle Balle", "Sweden", 18);
       newRunner(++startNum, "Kalle Balle", "Sweden", 18);
       newRunner(++startNum, "Kalle Balle", "Sweden", 18);
       System.out.println(runnerList.toString());
       
       
   }
   public void newRunner(int startNumber,String name,String nationality,int age){
       runnerList.add(new Runner(startNumber,name,nationality,age));
   }
   
   public ArrayList<Runner> getRunnersArray(){
       return runnerList.getRunnerList();
   }
    
}
