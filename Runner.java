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
    private double time;
    private boolean timeGiven;

    public Runner(int startNumber, String name, String nationality, int age) {
        this.startNumber = startNumber;
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.time = Double.MAX_VALUE;
        timeGiven = false;

    }

    public Runner(int startNumber, String name, String nationality, int age, double time) {
        this.startNumber = startNumber;
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.time = time;
    }

    public void setTime(double time) {
        this.time = time;
        timeGiven = true;
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

    public double getTime() {
        return time;
    }

    public String toString() {
        if (!timeGiven) {
            return startNumber + " " + name + " " + nationality + " " + age + " " + "--";
        } else {
            return startNumber + " " + name + " " + nationality + " " + age + " " + time;
        }
    }
}
