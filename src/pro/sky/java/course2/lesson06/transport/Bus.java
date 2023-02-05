package pro.sky.java.course2.lesson06.transport;

import pro.sky.java.course2.lesson06.driver.DriverD;

/**
 * Bus is a "child" class of the <code>Transport</code> class.
 *
 * @author Askar Gizatullin
 * @version 4.0
 */
public class Bus<D extends DriverD> extends Transport {

    private D driver;

    private BusCapacity busCapacity;


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

    public BusCapacity getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(BusCapacity busCapacity) {
        this.busCapacity = busCapacity;
    }


    public void printDriverStartingInformation() {
        System.out.println(getDriver().getFullName() + " is driving " + getBrand() + " " + getModel() + " and will participate in the race.");
    }


    @Override
    public boolean passDiagnostics() {
        System.out.println("Автобусы не могут проходить диагностику");
        return true;
    }

    @Override
    public void printType() {
        if (busCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства: " + getBusCapacity().name() + " (" + getBusCapacity().toString() + ")");
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
