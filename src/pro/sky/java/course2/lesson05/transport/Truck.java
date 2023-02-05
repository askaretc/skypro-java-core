package pro.sky.java.course2.lesson05.transport;

import pro.sky.java.course2.lesson05.driver.DriverC;

/**
 * Truck is a "child" class of the <code>Transport</code> class.
 *
 * @author Askar Gizatullin
 * @version 2.0
 */
public class Truck<C extends DriverC> extends Transport {

    private C driver;

    private TruckCapacityType truckCapacityType;


    /**
     * Class constructor that creates a truck by arguments.
     * The default values will be setting when the arguments are empty, null, or have an invalid value.
     *
     * @param brand        - brand
     * @param model        - model
     * @param engineVolume - engine capacity in liters
     */
    public Truck(String brand, String model, double engineVolume, C driver) {
        super(brand, model, engineVolume);
        this.driver = driver;
    }


    public C getDriver() {
        return driver;
    }

    public void setDriver(C driver) {
        this.driver = driver;
    }

    public TruckCapacityType getTruckCapacityType() {
        return truckCapacityType;
    }

    public void setTruckCapacityType(TruckCapacityType truckCapacityType) {
        this.truckCapacityType = truckCapacityType;
    }


    public void printDriverStartingInformation() {
        System.out.println(getDriver().getFullName() + " is driving " + getBrand() + " " + getModel() + " and will participate in the race.");
    }


    @Override
    public void printType() {
        if (truckCapacityType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства: " + getTruckCapacityType().name() + " (" + getTruckCapacityType().toString() + ")");
        }
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
