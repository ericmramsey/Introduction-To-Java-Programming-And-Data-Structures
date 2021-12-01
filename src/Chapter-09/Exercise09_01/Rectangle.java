/*
    Rectangle class used for Exercise09_01 to create the needed variables, constructor
    methods, and default Rectangle object.

    @author: Eric Ramsey
    @version: 03/05/21
 */

public class Rectangle {

    double width; // variable used to store the width of rectangle
    double height; // variable used to store the height of rectangle

    // Default constructor
    public Rectangle() {

        width = 1.0;
        height = 1.0;

    }
    // Constructor that creates a rectangle and accepts two arguments for height and width variables
    public Rectangle(double initWidth, double initHeight) {

        this.width = initWidth;
        this.height = initHeight;

    }
    // Method used to return the area of a rectangle
    public double getArea() {

        return height * width;

    }
    // Method used to return the perimeter of a rectangle
    public double getPerimeter() {

        return 2 * (height + width);

    }

}
