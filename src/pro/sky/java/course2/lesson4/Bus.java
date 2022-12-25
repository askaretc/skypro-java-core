package pro.sky.java.course2.lesson4;

import java.util.Objects;

/**
 * Bus is a "child" class of the <code>Transport</code> class.
 *
 * @author Askar Gizatullin
 * @version 2.0
 */
public class Bus extends Transport {

    /**
     * Class constructor that creates a bus with default values.
     */
    public Bus() {
        super("", "", 0);
    }

    /**
     * Class constructor that creates a bus by arguments.
     * The default values will be setting when the arguments are empty, null, or have an invalid value.
     *
     * @param brand        - brand
     * @param model        - model
     * @param engineVolume - engine capacity in liters
     */
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public void startMoving() {
        System.out.println("The bus starts moving.");
    }

    @Override
    public void finishMoving() {
        System.out.println("The bus finishes moving.");
    }

    @Override
    public String toString() {
        return "Brand & Model: " + getBrand() + " " + getModel() +
                "\nEngine volume, L: " + getEngineVolume() +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return getEngineVolume() == bus.getEngineVolume() && Objects.equals(getBrand(), bus.getBrand()) && Objects.equals(getModel(), bus.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngineVolume());
    }
}
