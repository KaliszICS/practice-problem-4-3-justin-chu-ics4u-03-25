public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        this.length = 4.0;
        this.width = 8.0;
    }

    /**
     * constructor with length parameter
     * create Rectangle with the specified length and a default width of 8.0.
     *
     * @param length the length to set for the rectangle, should be non-negative
     */
    public Rectangle(double length) {
        // Consider adding validation if needed (e.g., length >= 0)
        this.length = length;
        this.width = 8.0;
    }

    /**
     * constructor with length and width param
     * create Rectangle with the specified length and width
     *
     * @param length the length to set for the rectangle, should be non-negative
     * @param width  the width to set for the rectangle, should be non-negative
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //getter

    /**
     * gets the length of the rectangle
     *
     * @return the current length of the rectangle
     */
    public double getLength() {
        return this.length;
    }

    /**
     * gets the width of the rectangle
     *
     * @return the current width of the rectangle.
     */
    public double getWidth() {
        return this.width;
    }

}