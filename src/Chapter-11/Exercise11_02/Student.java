/*
    Student class that extends Person class and is used to meet requirements
    for Exercise11_02

    @author: Eric Ramsey
    @version: 03/21/21
 */

public class Student extends Person {

    private String STATUS;
    private String FRESHMAN = "Freshman";
    private String SOPHOMORE = "Sophomore";
    private String JUNIOR = "Junior";
    private String SENIOR = "Senior";

    // Default constructor
    Student() {

    }
    // Student class constructor with 5 args
    Student(String newName, String newAddress, String newPhoneNumber, String newEmailAddress, String STATUS) {

        super(newName, newAddress, newPhoneNumber, newEmailAddress);
        this.STATUS = STATUS;

    }
    // Method that sets the value of STATUS variable to initStatus
    public void setSTATUS(String initStatus) {

        this.STATUS = initStatus;

    }
    // Method that returns the STATUS value
    public String getSTATUS() {

        return STATUS;

    }
    // Converts output to string
    public String toString() {

        return "Name: " + getName() + "/nClass: " + getClass();

    }

}
