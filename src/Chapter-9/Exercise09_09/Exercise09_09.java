/*
    (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides
    have the same length and all angles have the same degree (i.e., the polygon is
    both equilateral and equiangular).

    Design a class named RegularPolygon that contains:
        A private int data field named n that defines the number of sides in the poly-
        gon with default value 3.
        A private double data field named side that stores the length of the side with
        default value 1.
        A private double data field named x that defines the x-coordinate of the poly-
        gon’s center with default value 0.
        A private double data field named y that defines the y-coordinate of the poly-
        gon’s center with default value 0.
        A no-arg constructor that creates a regular polygon with default values.
        A constructor that creates a regular polygon with the specified number of sides
        and length of side, centered at ( 0 , 0 ).
        A constructor that creates a regular polygon with the specified number of sides,
        length of side, and x- and y-coordinates.
        The accessor and mutator methods for all data fields.
        The method getPerimeter() that returns the perimeter of the polygon.
        The method getArea() that returns the area of the polygon. The formula for

    @author: Eric Ramsey
    @version: 03/05/21
 */

public class Exercise09_09 {

    public static void main(String[] args) {
        // Create three polygon objects with the given values
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6, 4);
        RegularPolygon p3 = new RegularPolygon(10,  4, 5.6, 7.8);
        // Final Output
        System.out.println("Polygon 1 perimeter: " + p1.getPerimeter());
        System.out.println("Polygon 1 area: " + p1.getArea());
        System.out.println("Polygon 2 perimeter: " + p2.getPerimeter());
        System.out.println("Polygon 2 area: " + p2.getArea());
        System.out.println("Polygon 3 perimeter: " + p3.getPerimeter());
        System.out.println("Polygon 3 area: " + p3.getArea());

    }

}
