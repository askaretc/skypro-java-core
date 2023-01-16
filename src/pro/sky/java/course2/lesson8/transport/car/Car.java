package pro.sky.java.course2.lesson8.transport.car;

import pro.sky.java.course2.lesson8.driver.DriverB;
import pro.sky.java.course2.lesson8.mechanic.Mechanic;
import pro.sky.java.course2.lesson8.transport.Transport;

/**
 * Car is a "child" class of the <code>Transport</code> class.
 *
 * @author Askar Gizatullin
 * @version 6.0
 */
public class Car<B extends DriverB> extends Transport {

    private B driver;

    private String bodyType;


    /**
     * Class constructor that creates a car by arguments.
     * The default values will be setting when the arguments are empty, null, or have an invalid value.
     *
     * @param brand         - brand
     * @param model         - model
     * @param engineVolume  - engine capacity in liters
     * @param mechanicsTeam - A team of these mechanics service this vehicle
     */
    public Car(String brand, String model, double engineVolume, B driver, Mechanic[] mechanicsTeam) {
        super(brand, model, engineVolume, mechanicsTeam);
        this.driver = driver;
    }


    public B getDriver() {
        return driver;
    }

    public void setDriver(B driver) {
        this.driver = driver;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        String[] bodyTypes = new String[CarBodyType.values().length];
        for (int i = 0; i < bodyTypes.length; i++) {
            bodyTypes[i] = CarBodyType.values()[i].name();
        }
        for (String s : bodyTypes) {
            if (s.equals(bodyType)) {
                this.bodyType = bodyType;
                break;
            }
        }
    }


    public void printDriverStartingInformation() {
        System.out.println(getDriver().getFullName() + " is driving " + getBrand() + " " + getModel() +
                " and will participate in the race.");
    }

    public void printCarTeamInformation() {
        System.out.println("THE " + getBrand().toUpperCase() + " " + getModel().toUpperCase() + " TEAM\n" +
                "Driver: " + getDriver().getFullName() + "\nMechanics: " + printAllMechanics());
    }


    @Override
    public boolean passDiagnostics() {
        return getEngineVolume() > 3.5;
    }

    @Override
    public void printType() {
        if (getBodyType() == null) {
            System.out.println("There is not enough data on the vehicle");
        } else {
            System.out.println(CarBodyType.valueOf(getBodyType()));
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
                "\n\n";
    }
}
