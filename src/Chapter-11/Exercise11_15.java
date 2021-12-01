/*
    (Area of a convex polygon)
    A polygon is convex if it contains any line segments that connects
    two points of the polygon. Write a program that prompts the user to enter
    the number of points in a convex polygon, then enter the points clockwise,
    and display the area of the polygon.

    @author: Eric Ramsey
    @version: 03/23/21
 */

import java.util.Scanner;

public class Exercise11_15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // User input for numOfPoints to be analyzed
        System.out.println("Enter the number of points: ");
        int numOfPoints = scanner.nextInt();
        System.out.println();

        // Two separate Arrays used to store x and y values for convex polygon coordinates
        double[] xValues = new double[numOfPoints];
        double[] yValues = new double[numOfPoints];

        // User input for the convex polygon coordinates
        System.out.println("Enter the coordinates of the points:");
        for (int i = 0; i < numOfPoints; i++) {

            xValues[i] = scanner.nextDouble();
            yValues[i] = scanner.nextDouble();

        }
        // Final output of the program, displays area and calls getConvexPolygonArea method
        System.out.println();
        System.out.println("The total area is " + getConvexPolygonArea(numOfPoints, xValues, yValues));
    }
    // Method used to return the area of a convex polygon
    public static double getConvexPolygonArea(int pointsTotal, double[] xArr, double[] yArr) {

        // Instance variables used to total the
        double pointValues1 = 0;
        double pointValues2 = 0;

        // Stores the total into pointValues1
        for (int i = 0; i < pointsTotal; i++) {

            if (i == pointsTotal - 1) {

                pointValues1 += xArr[i] * yArr[0];

            } else {

                pointValues1 += xArr[i] * yArr[i + 1];

            }
        }
        // Stores the total into pointValues2
        for (int c = 0; c < pointsTotal; c++) {

            if (c == pointsTotal - 1) {

                pointValues2 += yArr[c] * xArr[0];

            } else {

                pointValues2 += yArr[c] * xArr[c + 1];

            }
        }
        // returns the area of a convex polygon
        return Math.abs((pointValues1 - pointValues2) / 2);
    }
}
