package pro.sky.java.course2.lesson4;

/**
 * Transport is a "parent" (superclass) class that aggregating the transport's brand, model and engine volume.
 * <p>
 * The abstract class includes only properties and state.
 *
 * @author Askar Gizatullin
 * @version 2.0
 */
public abstract class Transport {

    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 8.0;

    private final String brand;
    private final String model;
    private double engineVolume;


    /**
     * Class constructor.
     * The default values will be setting when the arguments are empty, null, or have an invalid value.
     *
     * @param brand        - brand
     * @param model        - model
     * @param engineVolume - engine capacity in liters
     */
    public Transport(String brand, String model, double engineVolume) {
        this.brand = validateStringArgument(brand);
        this.model = validateStringArgument(model);
        this.engineVolume = validateEngineVolumeArgument(engineVolume);
    }


    public abstract void startMoving();

    public abstract void finishMoving();


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolumeArgument(engineVolume);
    }


    /**
     * @param stringValue - a string value that needs to be checked.
     * @return <code>DEFAULT_VALUE</code> if string value is specified incorrectly, contains null or empty;
     * <code>stringValue</code> otherwise.
     */
    protected final String validateStringArgument(String stringValue) {
        if (stringValue == null || stringValue.isEmpty() || stringValue.isBlank()) {
            return DEFAULT_VALUE;
        } else {
            return stringValue;
        }
    }

    /**
     * @param engineVolume - an engine value that needs to be checked.
     * @return <code>DEFAULT_ENGINE_VOLUME</code> if engine value is specified incorrectly (negative value);
     * <code>engineVolume</code> otherwise.
     */
    protected double validateEngineVolumeArgument(double engineVolume) {
        if (engineVolume <= 0) {
            return DEFAULT_ENGINE_VOLUME;
        } else {
            return engineVolume;
        }
    }
}
