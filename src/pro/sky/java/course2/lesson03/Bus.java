package pro.sky.java.course2.lesson03;

import java.util.Objects;

/**
 * Bus is a "child" class of the <code>Transport</code> class.
 *
 * @author Askar Gizatullin
 * @version 1.0
 */
public class Bus extends Transport {

    /**
     * Class constructor that creates a bus with default values.
     */
    public Bus() {
        super("", "", "", 0, "", 0);
    }

    /**
     * Class constructor that creates a bus by arguments.
     * The default values will be setting when the arguments are empty, null, or have an invalid value.
     *
     * @param brand             - brand
     * @param model             - model
     * @param productionCountry - production country
     * @param productionYear    - production year
     * @param bodyColor         - body color
     * @param maximumSpeed      - maximum speed
     */
    public Bus(String brand, String model, String productionCountry, int productionYear, String bodyColor, int maximumSpeed) {
        super(brand, model, productionCountry, productionYear, bodyColor, maximumSpeed);
    }

    @Override
    public String toString() {
        return "Brand & Model: " + getBrand() + " " + getModel() +
                "\nProduction: " + getProductionCountry() + ", " + getProductionYear() +
                "\nMaximum speed, km/h: " + getMaximumSpeed() +
                "\nBody color: " + getBodyColor() +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return getProductionYear() == bus.getProductionYear() && getMaximumSpeed() == bus.getMaximumSpeed() && Objects.equals(getBrand(), bus.getBrand()) && Objects.equals(getModel(), bus.getModel()) && Objects.equals(getProductionCountry(), bus.getProductionCountry()) && Objects.equals(getBodyColor(), bus.getBodyColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getProductionCountry(), getProductionYear(), getBodyColor(), getMaximumSpeed());
    }
}
