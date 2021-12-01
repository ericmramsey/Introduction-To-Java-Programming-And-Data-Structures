/*
    Regular Polygon class used to create the required values, default constructors, getter and
    setter methods needed for Exercise09_09.

    @author: Eric Ramsey
    @version: 03/05/21
 */

public class RegularPolygon {

    private int n;
    private double side;
    private double x = 0;
    private double y = 0;

    // Default constructor that creates a default regular polygon with set values for n and side
    RegularPolygon() {

        n = 3;
        side = 1;
        x = 0;
        y = 0;

    }
    // Constructor that creates a regular polygon and accepts two arguments for the n and side variables
    RegularPolygon(int n, double side) {

        this.n = n;
        this.side = side;
        x = 0;
        y = 0;

    }
    // Constructor that creates a regular polygon and accepts four arguments for the n, side, x, and y variables
    RegularPolygon(int n, double side, double x, double y) {

        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;

    }
    // Method used to set the value of variable n
    public void setN(int then) {

        n = then;

    }
    // Method used to return the value of variable n
    public int getN() {

        return n;

    }
    // Method used to set the value of variable side
    public void setSide(double initSide) {

        side = initSide;

    }
    // Method used to return the value of variable side
    public double getSide() {

        return side;

    }
    // Method used to set the value of variable y
    public void setY(int initY) {

        y = initY;

    }
    // Method used to return the value of variable y
    public double getY() {

        return y;

    }
    // Method used to return the perimeter of a regular polygon
    public double getPerimeter() {

        return n * side;

    }
    // Method used to return the area of a regular polygon
    public double getArea() {

        double sideSquared = side * side;
        return (n * sideSquared) / (4 * Math.tan(Math.PI / n));

    }
}
