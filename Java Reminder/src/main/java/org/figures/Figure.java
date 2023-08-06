package org.figures;

/**
 * Figure Class that extends to Triangle, Rectangle, Square
 */
public class Figure {
    // Attributes
    protected float base;
    protected float height;


    // Constructor
    /**
     * Figure Constructor
     *
     * @param base base of the figure
     * @param height height of the figure
     */
    public Figure(float base, float height){
        this.base = base;
        this.height = height;
    }


    // Getters
    public float getBase() {
        return base;
    }
    public float getHeight() {
        return height;
    }

    // Setters
    public void setBase(float base) {
        this.base = base;
    }
    public void setHeight(float height) {
        this.height = height;
    }


    // Methods
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
        return this.base + this.height;
    }
}
