/*
    MyDateTester is used to test the MyDate class to ensure that the
    desired results are achieved.

    @author: Eric Ramsey
    @version: 03/21/21
 */

public class MyDateTester {

    public static void main(String[] args) {

        MyDate date = new MyDate();
        System.out.println("year: " + date.getYear());
        System.out.println("month: " + date.getMonth());
        System.out.println("day: " + date.getDay());

        date = new MyDate(561555550000L);
        System.out.println("year: " + date.getYear());
        System.out.println("month: " + date.getMonth());
        System.out.println("day: " + date.getDay());

    }
}