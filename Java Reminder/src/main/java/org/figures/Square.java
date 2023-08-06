package org.figures;

/**
 * Square Class that inherits from Figure
 */
public class Square extends Figure{
    /**
     * Figure Constructor
     *
     * @param base base of the figure
     * @param height height of the figure
     */
    public Square(float base, float height) {
        super(base, height);
    }


    // Method Overload
    /**
     * Function to calculate perimeter
     *
     * @return perimeter of the figure (int)
     */
    public float calculatePerimeter(){
        return this.base * 4;
    }
}

