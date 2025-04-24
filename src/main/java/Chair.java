public class Chair {

    private int legs;
    private String material;

    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }

    /**
     * constructor with legs param
     * create Chair with the specified number of legs and the default material "wood"
     *
     * @param legs The number of legs for the chair, should be non-negative
     */
    public Chair(int legs) {
        // Consider adding validation if needed (e.g., legs >= 0)
        this.legs = legs;
        this.material = "wood";
    }

    /**
     * constructor with legs and material param
     * create Chair with the specified number of legs and material
     *
     * @param legs     The number of legs for the chair. Should be non-negative.
     * @param material The material the chair is made of. Should not be null or empty.
     */
    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    //gettas

    /**
     * gets the number of legs of the chair
     *
     * @return the current number of legs
     */
    public int getLegs() {
        return this.legs;
    }

    /**
     * gets the material of the chair
     *
     * @return the current material of the chair.
     */
    public String getMaterial() {
        return this.material;
    }

}