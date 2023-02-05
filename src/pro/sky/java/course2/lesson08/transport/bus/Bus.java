package pro.sky.java.course2.lesson08.transport.bus;

import pro.sky.java.course2.lesson08.driver.DriverD;
import pro.sky.java.course2.lesson08.mechanic.Mechanic;
import pro.sky.java.course2.lesson08.transport.Transport;

/**
 * Bus is a "child" class of the <code>Transport</code> class.
 *
 * @author Askar Gizatullin
 * @version 5.0
 */
public class Bus<D extends DriverD> extends Transport {

    private D driver;

    private String capacity;


    /**
     * Class constructor that creates a bus by arguments.
     * The default values will be setting when the arguments are empty, null, or have an invalid value.
     *
     * @param brand         - brand
     * @param model         - model
     * @param engineVolume  - engine capacity in liters
     * @param mechanicsTeam - A team of these mechanics service this vehicle
     */
    public Bus(String brand, String model, double engineVolume, D driver, Mechanic[] mechanicsTeam) {
        super(brand, model, engineVolume, mechanicsTeam);
        this.driver = driver;
    }


    public D getDriver() {
        return driver;
    }

    public void setDriver(D driver) {
        this.driver = driver;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        String[] busCapacities = new String[BusCapacity.values().length];
        for (int i = 0; i < busCapacities.length; i++) {
            busCapacities[i] = BusCapacity.values()[i].name();
        }
        for (String s : busCapacities) {
            if (s.equals(capacity)) {
                this.capacity = capacity;
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
        throw new RuntimeException("Buses cannot pass diagnostics");
    }

    @Override
    public void printType() {
        if (getCapacity() == null) {
            System.out.println("There is not enough data on the vehicle");
        } else {
            System.out.println(BusCapacity.valueOf(getCapacity()));
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
