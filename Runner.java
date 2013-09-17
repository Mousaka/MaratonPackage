/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MaratonPackage;

/**
 *
 * @author krille
 */
public class Runner {

    private int startNumber;
    private String name;
    private String nationality;
    private int age;
    private String time;

    public Runner(int startNumber, String name, String nationality, int age) {
        this.startNumber = startNumber;
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.time = "--";
    }
    
        public Runner(int startNumber, String name, String nationality, int age, String time) {
        this.startNumber = startNumber;
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.time = time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getStartNumber() {
        return startNumber;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    public String getTime() {
        return time;
    }

    public String toString() {
        return startNumber + " " + name + " " + nationality + " " + age + " " + time;
    }
}
