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
    public String toString() {
        return "Brand & Model: " + getBrand() + " " + getModel() +
                "\nEngine volume, L: " + getEngineVolume() +
                "\nAmount of pit-stop: " + getAmountOfPitStop() +
                "\nMinutes of best lap time: " + getBestLapTime() +
                "\nMaximum speed, km/h: " + getMaximumSpeed() +
                "\n";
    }
}
