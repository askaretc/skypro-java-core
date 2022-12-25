package pro.sky.java.course2.lesson4;

import java.util.Objects;

/**
 * Truck is a "child" class of the <code>Transport</code> class.
 *
 * @author Askar Gizatullin
 * @version 1.0
 */
public class Truck extends Transport {

    /**
     * Class constructor that creates a truck with default values.
     */
    public Truck() {
        super("", "", 0);
    }

    /**
     * Class constructor that creates a truck by arguments.
     * The default values will be setting when the arguments are empty, null, or have an invalid value.
     *
     * @param brand        - brand
     * @param model        - model
     * @param engineVolume - engine capacity in liters
     */
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public void startMoving() {
        System.out.println("The truck starts moving.");
    }

    @Override
    public void finishMoving() {
        System.out.println("The truck finishes moving.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return getEngineVolume() == truck.getEngineVolume() && Objects.equals(getBrand(), truck.getBrand()) && Objects.equals(getModel(), truck.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngineVolume());
    }
}
