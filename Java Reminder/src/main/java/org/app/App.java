package org.app;

import org.figures.Rectangle;
import org.figures.Square;
import org.figures.Triangle;

/**
 * App Initialization
 *
 */
public class App 
{
    /**
     * Main App function
     * @param args
     */
    public static void main( String[] args )
    {
        // Data Initializer
        Square square = new Square((float) 3.5, (float) 3.5);
        Rectangle rectangle = new Rectangle((float) 2.5, 4);
        Triangle triangle = new Triangle((float) 2.5, 4);

        // Print Square
        System.out.println("Square Base: " + square.getBase());
        System.out.println("Square Height: " + square.getHeight());
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());

        // Print Rectangle
        System.out.println("Rectangle Base: " + rectangle.getBase());
        System.out.println("Rectangle Height: " + rectangle.getHeight());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        // Print Triangle
        System.out.println("Triangle Base: " + triangle.getBase());
        System.out.println("Triangle Height: " + triangle.getHeight());
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
