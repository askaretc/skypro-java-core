package pro.sky.java.course2.lesson9.transport.truck;

import pro.sky.java.course2.lesson9.driver.DriverC;
import pro.sky.java.course2.lesson9.mechanic.Mechanic;
import pro.sky.java.course2.lesson9.transport.Transport;

/**
 * Truck is a "child" class of the <code>Transport</code> class.
 *
 * @author Askar Gizatullin
 * @version 4.0
 */
public class Truck<C extends DriverC> extends Transport {

    private C driver;

    private String capacityType;


    /**
     * Class constructor that creates a truck by arguments.
     * The default values will be setting when the arguments are empty, null, or have an invalid value.
     *
     * @param brand         - brand
     * @param model         - model
     * @param engineVolume  - engine capacity in liters
     * @param mechanicsTeam - A team of these mechanics service this vehicle
     */
    public Truck(String brand, String model, double engineVolume, C driver, Mechanic[] mechanicsTeam) {
        super(brand, model, engineVolume, mechanicsTeam);
        this.driver = driver;
    }


    public C getDriver() {
        return driver;
    }

    public void setDriver(C driver) {
        this.driver = driver;
    }

    public String getCapacityType() {
        return capacityType;
    }

    public void setCapacityType(String capacityType) {
        String[] truckCapacityTypes = new String[TruckCapacityType.values().length];
        for (int i = 0; i < truckCapacityTypes.length; i++) {
            truckCapacityTypes[i] = TruckCapacityType.values()[i].name();
        }
        for (String s : truckCapacityTypes) {
            if (s.equals(capacityType)) {
                this.capacityType = capacityType;
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
        return getEngineVolume() > 10;
    }

    @Override
    public void printType() {
        if (getCapacityType() == null) {
            System.out.println("There is not enough data on the vehicle");
        } else {
            System.out.println(TruckCapacityType.valueOf(getCapacityType()));
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
