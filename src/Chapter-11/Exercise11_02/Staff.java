/*
    Staff class that extends Employee class and is used to meet requirements
    for Exercise11_02

    @author: Eric Ramsey
    @version: 03/21/21
 */

public class Staff extends Employee {

    private String title;
    // Staff class default constructor
    Staff() {

    }
    // Staff class constructor that takes newTitle
    Staff( String newTitle) {

        this.title = newTitle;

    }
    // Method that sets the value for the title string variable
    public void setTitle(String initTitle) {

        this.title = title;

    }
    // Method that returns the value for the title string variable
    public String getTitle() {

        return title;

    }
    // Converts the value to string
    public String toString() {

        return "Name: " + getName() + "/nClass: " + getClass();

    }
}
