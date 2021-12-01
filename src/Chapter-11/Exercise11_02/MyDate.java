/*
    MyDate class and is used to meet requirements for Exercise11_02 and is tested by
    the MyDateTester.java file.

    @author: Eric Ramsey
    @version: 03/21/21
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {

    private int year;
    private int month;
    private int day;

    // Default Constructor Method
    MyDate() {

        GregorianCalendar date = new GregorianCalendar();
        // Find year, month, and day from date. You write your own code to replace the out-dated get methods
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);

    }
    // Constructor Method with one arg for elapsedTime variable
    MyDate(long elapsedTime) {

        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        // Find year, month, and day from date. You write your own code to replace the out-dated get methods
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);

    }
    // Constructor Method with three args for year, month, and day
    MyDate(int year, int month, int day) {

        this.year = year;
        this.month = month;
        this.day = day;

    }
    // Method used to return the value of year variable
    public int getYear() {

        return year;

    }
    // Method used to return the value of month variable
    public int getMonth() {

        return month;

    }
    // Method used to return the value of day variable
    public int getDay() {

        return day;

    }
    // Method used to set the value of year variable
    public void setYear(int year) {

        this.year = year;

    }
    // Method used to set the value of month variable
    public void setMonth(int month) {

        this.month = month;

    }
    // Method used to set the value of day variable
    public void setDay(int day) {

        this.day = day;
        
    }
}