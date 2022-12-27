package pro.sky.java.course2.lesson4.transport;

import pro.sky.java.course2.lesson4.driver.DriverD;

/**
 * Bus is a "child" class of the <code>Transport</code> class.
 *
 * @author Askar Gizatullin
 * @version 2.0
 */
public class Bus<D extends DriverD> extends Transport {

    private D driver;


    /**
     * Class constructor that creates a bus by arguments.
     * The default values will be setting when the arguments are empty, null, or have an invalid value.
     *
     * @param brand        - brand
     * @param model        - model
     * @param engineVolume - engine capacity in liters
     */
    public Bus(String brand, String model, double engineVolume, D driver) {
        super(brand, model, engineVolume);
        this.driver = driver;
    }


    public D getDriver() {
        return driver;
    }

    public void setDriver(D driver) {
        this.driver = driver;
    }


    public void printDriverStartingInformation() {
        System.out.println(getDriver().getFullName() + " is driving " + getBrand() + " " + getModel() + " and will participate in the race.");
    }


    @Override
    public String toString() {
        return "Brand & Model: " + getBrand() + " " + getModel() +
                "\nEngine volume, L: " + getEngineVolume() +
                "\nAmount of pit-stop: " + getAmountOfPitStop() +
                "\nMinutes of best lap time: " + getBestLapTime() +
                "\nMaximum speed, km/h: " + getMaximumSpeed() +
                "\nDriver's full name: " + getDriver().getFullName() +
                "\n";
    }
}
