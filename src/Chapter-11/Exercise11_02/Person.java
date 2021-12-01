/*
    Person class and is used to meet requirements for Exercise11_02

    @author: Eric Ramsey
    @version: 03/21/21
 */

public class Person {

    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    // Default constructor
     Person() {

    }
    // Person class constructor with 4 args
    Person(String newName, String newAddress, String newPhoneNum, String newEmail) {

         this.name = newName;
         this.address = newAddress;
         this.phoneNumber = newPhoneNum;
         this.emailAddress = newEmail;

    }
    // Method that sets the name variable value to initName
    public void setName(String initName) {

        this.name = initName;

    }
    // Method that returns the name variable value
    public String getName() {

        return name;

    }
    // Method that sets the address variable value to newAddress
    public void setAddress(String newAddress) {

        this.address = newAddress;

    }
    // Method that returns the address variable value
    public String getAddress() {

        return address;

    }
    // Method that sets the phoneNumber variable value to newPhoneNumber
    public void setPhoneNumber(String newPhoneNumber) {

        this.phoneNumber = newPhoneNumber;

    }
    // Method that returns the phoneNumber variable value
    public String getPhoneNumber() {

        return phoneNumber;

    }
    // Method that sets the emailAddress variable to newEmailAddress
    public void setEmailAddress(String newEmailAddress) {

        this.emailAddress = newEmailAddress;

    }
    // Method that returns the emailAddress variable value
    public String getEmailAddress() {

        return emailAddress;

    }
    // Method that converts output to string
    public String toString() {

        return "Name: " + getName() + "/nClass: " + getClass();

    }
}