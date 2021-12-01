/*
    (Geometry: the Circle2D class) Define the Circle2D class that contains:
        ■ Two double data fields named x and y that specify the center of the circle with getter methods.
        ■ A data field radius with a getter method.
        ■ A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1for radius.
        ■ A constructor that creates a circle with the specified x, y, and radius.
        ■ A method getArea() that returns the area of the circle.
        ■ A method getPerimeter() that returns the perimeter of the circle.
        ■ A method contains(double  x,  double  y) that returns true if the specified point (x, y) is inside
        this circle (see Figure 10.21a).
        ■ A method contains(Circle2D circle) that returns true if the specified circle is inside
        this circle (see Figure 10.21b).
        ■ A method overlaps(Circle2D circle) that returns true if the specified circle
        overlaps with this circle (see Figure 10.21c).

    @author: Eric Ramsey
    @version: 03/17/21
 */


public class Circle2D {
    // instance variables for Circle parameters
    private double x;
    private double y;
    private double radius;
    // Default Circle object no-arg constructor
    Circle2D() {

        x = 0;
        y = 0;
        radius = 1;

    }
    // Circle2D constructor with specified values for x, y, and radius
    Circle2D(double newX, double newY, double newRadius) {

        this.x = newX;
        this.y = newY;
        this.radius = newRadius;

    }
    // Setter method for x variable value
    public void setX(double anotherX) {

        this.x = anotherX;

    }
    // Getter method for x variable value
    public double getX() {

        return x;

    }
    // Setter method for x variable value
    public void setY(double anotherY) {

        this.y = anotherY;

    }
    // Getter method for y variable value
    public double getY() {

        return y;

    }
    // Setter method for the radius variable value
    public void setRadius(double anotherRadius) {

        this.radius = anotherRadius;

    }
    // Getter method for the radius variable value
    public double getRadius() {

        return radius;

    }
    // Method that returns the area of a circle
    public double getCircleArea() {

        return Math.PI * (getRadius() * getRadius());

    }
    // Method that returns the perimeter of a circle
    public double getCirclePerimeter() {

        return 2 * (Math.PI * radius);

    }
    // Method that returns true if the specific x and y values are inside circle
    public boolean contains(double initX, double initY) {

        if (Math.pow(initX - getX(), 2.0) * (Math.pow(initY - getY(), 2.0)) <= Math.pow(getRadius(), 2.0)) {

            return true;

        }
        return false;

    }
    // Method that returns true if the specified circle is inside this circle
    public boolean contains(Circle2D circle) {

        if (circle.getCirclePerimeter() < getCirclePerimeter()) {

            return true;

        }

        return false;

    }
    // Method that returns true if the specified circle overlaps with this circle
    public boolean overlaps(Circle2D circle) {

        if (circle.getCirclePerimeter() > getCirclePerimeter()) {

            return true;

        }

        return false;

    }
}
