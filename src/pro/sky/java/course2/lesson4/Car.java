package pro.sky.java.course2.lesson4;

import java.util.Objects;

/**
 * Car is a "child" class of the <code>Transport</code> class.
 *
 * @author Askar Gizatullin
 * @version 4.0
 */
public class Car extends Transport {

    /**
     * Class constructor that creates a car with default values.
     */
    public Car() {
        super("", "", 0);
    }

    /**
     * Class constructor that creates a car by arguments.
     * The default values will be setting when the arguments are empty, null, or have an invalid value.
     *
     * @param brand        - brand
     * @param model        - model
     * @param engineVolume - engine capacity in liters
     */
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public void startMoving() {
        System.out.println("The car starts moving.");
    }

    @Override
    public void finishMoving() {
        System.out.println("The car finishes moving.");
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
        Car car = (Car) o;
        return getEngineVolume() == car.getEngineVolume() && Objects.equals(getBrand(), car.getBrand()) && Objects.equals(getModel(), car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngineVolume());
    }
}
