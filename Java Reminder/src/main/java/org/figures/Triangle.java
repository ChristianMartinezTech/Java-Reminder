package org.figures;

/**
 * Triangle Class that inherits from Figure
 */
public class Triangle extends Figure{
    /**
     * Figure Constructor
     *
     * @param base base of the figure
     * @param height height of the figure
     */
    public Triangle(float base, float height) {
        super(base, height);
    }


    // Method Overload
    /**
     * Function to calculate area
     *
     * @return area of the figure (int)
     */
    public float calculateArea(){
        return (float) (0.5 * this.base * this.height);
    }

    /**
     * Function to calculate perimeter
     *
     * @return perimeter of the figure (int)
     */
    public float calculatePerimeter(){
        return this.base + (this.height * 2);
    }
}
