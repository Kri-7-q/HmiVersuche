package Utility;

/**
 * Constants in an enum.
 */
public enum Constant {

    MapImagePath("file:///Users/Christian/Downloads/map.jpg");

    private Object value;

    // Constructor
    private Constant(Object value) {
        this.value = value;
    }

    // Getter
    public Object value() {
        return value;
    }

}
