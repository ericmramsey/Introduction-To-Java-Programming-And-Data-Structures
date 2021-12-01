/*
    Employee class that extends Person class and is used to meet requirements
    for Exercise11_02

    @author: Eric Ramsey
    @version: 03/21/21
 */
public class Employee extends Person {

    private String office;
    private String salary;
    MyDate dateHired = new MyDate();

    // Default constructor
    Employee() {

    }
    // Employee class constructor with three args
    public Employee(String newName, String newOffice, String newSalary) {

        super.setName(newName);
        this.office = newOffice;
        this.salary = newSalary;

    }
    // Sets the value of the variable office to the value of initOffice
    public void setOffice(String initOffice) {

        this.office = initOffice;

    }
    // gets the value of the variable office
    public String getOffice() {

        return office;

    }
    // Sets the value of the variable salary to the value of initSalary
    public void setSalary(String initSalary) {

        this.salary = initSalary;

    }
    // Gets the value of salary variable
    public String getSalary() {

        return salary;

    }
    // Sets the value of dateHired variable to initDateHired value
    public void setDateHired(MyDate initDateHired) {

        this.dateHired = initDateHired;

    }
    // Gets the value of dateHired
    public MyDate getDateHired() {

        return dateHired;

    }
    // Converts output to string value
    public String toString() {

        return "Name: " + getName() + "/nClass: " + getClass();

    }
}
