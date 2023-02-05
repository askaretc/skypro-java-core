package pro.sky.java.course2.lesson08.transport;

import pro.sky.java.course2.lesson08.mechanic.Mechanic;

import java.util.*;

/**
 * Transport is a "parent" (superclass) class that aggregating the transport's brand, model and engine volume.
 * <p>
 * The abstract class includes only properties and state.
 *
 * @author Askar Gizatullin
 * @version 5.0
 */
public abstract class Transport implements Competing {

    private final List<Mechanic> mechanicList = new ArrayList<>();


    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 8.0;

    private final String brand;
    private final String model;
    private double engineVolume;

    private int amountOfPitStop;
    private int minutesOfBestLapTime;
    private int maximumSpeed;


    /**
     * Class constructor.
     * The default values will be setting when the arguments are empty, null, or have an invalid value.
     *
     * @param brand         - brand
     * @param model         - model
     * @param engineVolume  - engine capacity in liters
     * @param mechanicsTeam - A team of these mechanics service this vehicle
     */
    public Transport(String brand, String model, double engineVolume, Mechanic[] mechanicsTeam) {
        this.brand = validateStringArgument(brand);
        this.model = validateStringArgument(model);
        this.engineVolume = validateEngineVolumeArgument(engineVolume);
        Collections.addAll(mechanicList, mechanicsTeam);
    }


    protected String printAllMechanics() {
        String s;
        StringBuilder sb = new StringBuilder();
        String[] list = new String[mechanicList.size()];
        int lastIndexNum = mechanicList.size() - 1;
        for (int i = 0; i < mechanicList.size(); i++) {
            if (i == lastIndexNum) {
                list[i] = mechanicList.get(i).getFullName() + "\n";
            } else {
                list[i] = mechanicList.get(i).getFullName() + ", ";
            }
        }
        for (String element : list) {
            sb.append(element);
        }
        s = sb.toString();
        return s;
    }

    public abstract void printType();

    public abstract boolean passDiagnostics();


    public void startMoving() {
        System.out.println("The " + getBrand() + " " + getModel() + " starts moving.");
    }

    public void finishMoving() {
        System.out.println("The " + getBrand() + " " + getModel() + " finishes moving.");
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolumeArgument(engineVolume);
    }


    public void setAmountOfPitStop(int amountOfPitStop) {
        this.amountOfPitStop = validateIntegerArgument(amountOfPitStop);
    }

    public void setMinutesOfBestLapTime(int minutesOfBestLapTime) {
        this.minutesOfBestLapTime = validateIntegerArgument(minutesOfBestLapTime);
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = validateIntegerArgument(maximumSpeed);
    }


    @Override
    public int getAmountOfPitStop() {
        return amountOfPitStop;
    }

    @Override
    public int getBestLapTime() {
        return minutesOfBestLapTime;
    }

    @Override
    public int getMaximumSpeed() {
        return maximumSpeed;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) &&
                Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }


    /**
     * @param stringValue - a string value that needs to be checked.
     * @return <code>DEFAULT_VALUE</code> if string value is specified incorrectly, contains null or empty;
     * <code>stringValue</code> otherwise.
     */
    private String validateStringArgument(String stringValue) {
        if (stringValue == null || stringValue.isEmpty() || stringValue.isBlank()) {
            return DEFAULT_VALUE;
        } else {
            return stringValue;
        }
    }

    /**
     * @param engineVolume - an engine value that needs to be checked.
     * @return <code>DEFAULT_ENGINE_VOLUME</code> if engine value is specified incorrectly (negative value);
     * <code>engineVolume</code> otherwise.
     */
    private double validateEngineVolumeArgument(double engineVolume) {
        if (engineVolume <= 0) {
            return DEFAULT_ENGINE_VOLUME;
        } else {
            return engineVolume;
        }
    }

    private int validateIntegerArgument(int integerArgument) {
        return Math.max(integerArgument, 0);
    }
}
