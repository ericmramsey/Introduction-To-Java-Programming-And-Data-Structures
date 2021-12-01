/*
    This program will ask the user the number of rows and columns for a
    two dimensional array and for the user to enter the elements of the array.
    The program will then determine the largest element and its location

    @author: Eric Ramsey
    @version: 09/13/21
*/


import java.util.Scanner;

public class Exercise09_13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int row = 0;
        int column = 0;

        System.out.println("Enter the number of rows and columns in the array: ");
        row = scanner.nextInt();
        column = scanner.nextInt();

        double[][] array = new double[row][column];

        System.out.println("Enter the array: ");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                array[i][j] = scanner.nextDouble();

            }
        }
        System.out.println();
        Location maxElementLocation = locateLargest(array);
        System.out.println(maxElementLocation.getLocation());

    }
    public static Location locateLargest(double[][] initArray) {

        return new Location(initArray);

    }
}
