/*
    (The Person, Student, Employee, Faculty, and Staff classes) Design a
    class named Person and its two subclasses named Student and Employee.
    Make Faculty and Staff subclasses of Employee. A person has a name,
    address, phone number, and email address. A student has a class status (freshman,
    sophomore, junior, or senior). Define the status as a constant. An employee has
    an office, salary, and date hired. Use the MyDate class defined in Programming
    Exercise 10.14 to create an object for date hired. A faculty member has office
    hours and a rank. A staff member has a title. Override the toString method in
    each class to display the class name and the person’s name.
    Draw the UML diagram for the classes and implement them. Write a test program
    that creates a Person, Student, Employee, Faculty, and Staff, and
    invokes their toString() methods.

    @author: Eric Ramsey
    @version: 03/21/21
 */
public class Exercise11_02 {

    public static void main(String[] args) {

        // Initializing values for the classes Person, Student, Employee, Faculty, and Staff
        Person person1 = new Person("Tony Stark", "200 Park Ave, New York, NY", "867-5309", "iamironman@stark.com");
        Student student1 = new Student("Peter Parker", "20 Ingram Street, Forest Hills Garden, NY", "718-444-4444", "webspinner@gmail.com", "Senior");
        Employee employee1 = new Employee("Professor Jimbus", "Room 333", "45,000");
        MyDate e1HireDate = new MyDate(1976, 3, 22);
        Employee employee2 = new Employee("Handyman Dave", "Boiler Room", "45,000");
        MyDate e2HireDate = new MyDate(2020, 6, 22);
        Faculty faculty1 = new Faculty("1pm-2pm", "Non-Tenure-Track");
        Staff staff1 = new Staff("Boiler Room Team Lead");

        // person1 output
        System.out.println("======================");
        System.out.println("Name: " + person1.getName());
        System.out.println("Address: " + person1.getAddress());
        System.out.println("Phone Number: " + person1.getPhoneNumber());
        System.out.println("Email Address: " + person1.getEmailAddress());
        System.out.println();
        // student1 output
        System.out.println("======================");
        System.out.println("Name: " + student1.getName());
        System.out.println("Address: " + student1.getAddress());
        System.out.println("Phone Number: " + student1.getPhoneNumber());
        System.out.println("Email Address: " + student1.getEmailAddress());
        System.out.println("Status: " + student1.getSTATUS());
        System.out.println();
        // employee1 output
        System.out.println("======================");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Office: " + employee1.getOffice());
        System.out.println("Salary: " + employee1.getSalary());
        System.out.println("Rank: " + faculty1.getRank());
        System.out.println("-----Date Hired-----");
        System.out.println("Year: " + e1HireDate.getYear());
        System.out.println("Month: " + e1HireDate.getMonth());
        System.out.println("Day: " + e1HireDate.getDay());
        System.out.println();
        // employee2 output
        System.out.println("======================");
        System.out.println("Name: " + employee2.getName());
        System.out.println("Office: " + employee2.getOffice());
        System.out.println("Salary:" + employee2.getSalary());
        System.out.println("Title: " + staff1.getTitle());
        System.out.println("-----Date Hired-----");
        System.out.println("Year: " + e2HireDate.getYear());
        System.out.println("Month: " + e2HireDate.getMonth());
        System.out.println("Day: " + e2HireDate.getDay());
        System.out.println("======================");

    }
}
