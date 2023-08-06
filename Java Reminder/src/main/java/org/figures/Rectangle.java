package org.figures;

public class Rectangle extends Figure {

    /**
     * Figure Constructor
     *
     * @param base   base of the figure
     * @param height height of the figure
     */
    public Rectangle(float base, float height) {
        super(base, height);
    }


    // Method Overload
    /**
     * Function to calculate area
     *
     * @return area of the figure (int)
     */
    public float calculateArea(){
        return this.base * this.height;
    }

    /**
     * Function to calculate perimeter
     *
     * @return perimeter of the figure (int)
     */
    public float calculatePerimeter(){
        return (this.base * 2) + (this.height * 2);
    }
}
