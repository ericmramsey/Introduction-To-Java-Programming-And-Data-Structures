/*
    Faculty class that extends Employee class and is used to meet requirements
    for Exercise11_02

    @author: Eric Ramsey
    @version: 03/21/21
 */

public class Faculty extends Employee {

    private String officeHours;
    private String rank;
    // Default constructor
    Faculty() {

    }
    // Constructor for faculty class
    Faculty(String newOfficeHours, String newRank) {

        this.officeHours = newOfficeHours;
        this.rank = newRank;

    }
    // Sets the value for variable officeHours from the value of initOfficeHours
    public void setOfficeHours(String initOfficeHours) {

        this.officeHours = initOfficeHours;

    }
    // Gets the value of officeHours variable
    public String getOfficeHours() {

        return officeHours;

    }
    // Sets the value for the variable rank from the value of initRank
    public void setRank(String initRank) {

        this.rank = initRank;

    }
    // Gets the value from rank variable
    public String getRank() {

        return rank;

    }
    // Converts to string output
    public String toString() {

        return "Name: " + getName() + "/nClass: " + getClass();

    }
}
