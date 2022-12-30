package pro.sky.java.course2.lesson5.transport;

import pro.sky.java.course2.lesson5.driver.DriverB;

/**
 * Car is a "child" class of the <code>Transport</code> class.
 *
 * @author Askar Gizatullin
 * @version 5.0
 */
public class Car<B extends DriverB> extends Transport {

    private B driver;

    private CarBodyType carBodyType;


    /**
     * Class constructor that creates a car by arguments.
     * The default values will be setting when the arguments are empty, null, or have an invalid value.
     *
     * @param brand        - brand
     * @param model        - model
     * @param engineVolume - engine capacity in liters
     */
    public Car(String brand, String model, double engineVolume, B driver) {
        super(brand, model, engineVolume);
        this.driver = driver;
    }


    public B getDriver() {
        return driver;
    }

    public void setDriver(B driver) {
        this.driver = driver;
    }

    public CarBodyType getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(CarBodyType carBodyType) {
        this.carBodyType = carBodyType;
    }


    public void printDriverStartingInformation() {
        System.out.println(getDriver().getFullName() + " is driving " + getBrand() + " " + getModel() + " and will participate in the race.");
    }


    @Override
    public void printType() {
        if (carBodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства: " + getCarBodyType().name() + " (" + getCarBodyType().toString() + ")");
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
