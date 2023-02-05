package pro.sky.java.course2.lesson03;

/**
 * Transport is a "parent" (superclass) class that aggregating the transport's brand, model, production country,
 * production year, body color and maximum speed.
 * <p>
 * The abstract class includes only properties and state.
 *
 * @author Askar Gizatullin
 * @version 1.0
 */
public abstract class Transport {

    private static final String DEFAULT_VALUE = "default";
    private static final int DEFAULT_PRODUCTION_YEAR = 2000;
    private static final String DEFAULT_BODY_COLOR = "white";
    private static final int DEFAULT_MAXIMUM_SPEED = 110;

    private final String brand;
    private final String model;
    private final String productionCountry;
    private final int productionYear;
    private String bodyColor;
    private int maximumSpeed;


    /**
     * Class constructor.
     * The default values will be setting when the arguments are empty, null, or have an invalid value.
     *
     * @param brand             - brand
     * @param model             - model
     * @param productionCountry - production country
     * @param productionYear    - production year
     * @param bodyColor         - body color
     * @param maximumSpeed      - maximum speed
     */
    public Transport(String brand, String model, String productionCountry, int productionYear, String bodyColor, int maximumSpeed) {
        this.brand = checkStringArgumentIsDefault(brand, DEFAULT_VALUE);
        this.model = checkStringArgumentIsDefault(model, DEFAULT_VALUE);
        this.productionCountry = checkStringArgumentIsDefault(productionCountry, DEFAULT_VALUE);
        this.productionYear = checkIntegerArgumentIsDefault(productionYear, DEFAULT_PRODUCTION_YEAR);
        this.bodyColor = checkStringArgumentIsDefault(bodyColor, DEFAULT_BODY_COLOR);
        this.maximumSpeed = checkIntegerArgumentIsDefault(maximumSpeed, DEFAULT_MAXIMUM_SPEED);
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = checkStringArgumentIsDefault(bodyColor, DEFAULT_BODY_COLOR);
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = checkIntegerArgumentIsDefault(maximumSpeed, DEFAULT_MAXIMUM_SPEED);
    }


    /**
     * @param stringValue          - a string value that needs to be checked.
     * @param DEFAULT_STRING_VALUE - default value (constant).
     * @return <code>DEFAULT_STRING_VALUE</code> if string value is specified incorrectly, contains null or empty;
     * <code>stringValue</code> otherwise.
     */
    public final String checkStringArgumentIsDefault(String stringValue, String DEFAULT_STRING_VALUE) {
        if (stringValue == null || stringValue.isEmpty() || stringValue.isBlank()) {
            return DEFAULT_STRING_VALUE;
        } else {
            return stringValue;
        }
    }

    /**
     * @param integerValue          - an integer value that needs to be checked.
     * @param DEFAULT_INTEGER_VALUE - default value (constant).
     * @return <code>DEFAULT_INTEGER_VALUE</code> if integer value is specified incorrectly (negative value);
     * <code>integerValue</code> otherwise.
     */
    public final int checkIntegerArgumentIsDefault(int integerValue, int DEFAULT_INTEGER_VALUE) {
        if (integerValue <= 0) {
            return DEFAULT_INTEGER_VALUE;
        } else {
            return integerValue;
        }
    }
}
