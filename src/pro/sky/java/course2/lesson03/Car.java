package pro.sky.java.course2.lesson03;

import java.util.Objects;

/**
 * Car is a "child" class of the <code>Transport</code> class and extends it with own additional fields and methods.
 *
 * @author Askar Gizatullin
 * @version 3.0
 */
public class Car extends Transport {

    private static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return remoteEngineStart == key.remoteEngineStart && keylessAccess == key.keylessAccess;
        }

        @Override
        public int hashCode() {
            return Objects.hash(remoteEngineStart, keylessAccess);
        }
    }

    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private static final String DEFAULT_TRANSMISSION = "manual gearbox";
    private static final String DEFAULT_BODY_TYPE = "sedan";
    private static final String DEFAULT_REGISTRATION_NUMBER_VALUE = "X 000 XX 00";
    private static final int DEFAULT_SEATS_AMOUNT = 5;

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seatsAmount;
    private boolean winterTire;

    private final Key key;


    /**
     * Class constructor that creates a car with default values.
     */
    public Car() {
        super("", "", "", 0, "", 0);
        engineVolume = DEFAULT_ENGINE_VOLUME;
        transmission = DEFAULT_TRANSMISSION;
        bodyType = DEFAULT_BODY_TYPE;
        registrationNumber = DEFAULT_REGISTRATION_NUMBER_VALUE;
        seatsAmount = DEFAULT_SEATS_AMOUNT;
        winterTire = false;
        key = new Key(false, false);
    }

    /**
     * Class constructor that creates a car by arguments.
     * The default values will be setting when the arguments are empty, null, or have an invalid value.
     *
     * @param brand              - brand
     * @param model              - model
     * @param productionCountry  - production country
     * @param productionYear     - production year
     * @param engineVolume       - engine capacity in liters
     * @param maximumSpeed       - the maximum speed of the car
     * @param transmission       - type of car transmission
     * @param bodyType           - car body type
     * @param registrationNumber - registration number
     * @param seatsAmount        - number of seats
     * @param winterTire         - availability of winter tires
     */
    public Car(String brand, String model, String productionCountry, int productionYear, double engineVolume, int maximumSpeed, String bodyColor, String transmission, String bodyType, String registrationNumber, int seatsAmount, boolean winterTire, boolean remoteEngineStart, boolean keylessAccess) {
        super(brand, model, productionCountry, productionYear, bodyColor, maximumSpeed);
        this.engineVolume = validateEngineVolumeArgument(engineVolume);
        this.transmission = checkStringArgumentIsDefault(transmission, DEFAULT_TRANSMISSION);
        this.bodyType = checkStringArgumentIsDefault(bodyType, DEFAULT_BODY_TYPE);
        this.registrationNumber = checkStringArgumentIsDefault(registrationNumber, DEFAULT_REGISTRATION_NUMBER_VALUE);
        this.seatsAmount = checkIntegerArgumentIsDefault(seatsAmount, DEFAULT_SEATS_AMOUNT);
        this.winterTire = winterTire;
        key = new Key(remoteEngineStart, keylessAccess);
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolumeArgument(engineVolume);
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = checkStringArgumentIsDefault(transmission, DEFAULT_TRANSMISSION);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = checkStringArgumentIsDefault(registrationNumber, DEFAULT_REGISTRATION_NUMBER_VALUE);
    }

    public boolean isWinterTire() {
        return winterTire;
    }

    public void setWinterTire(boolean winterTire) {
        this.winterTire = winterTire;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }


    /**
     * The method sets the <code>winterTire</code> field to true or false according to current season.
     *
     * @param currentMonth - current month
     */
    public void setSeasonTire(int currentMonth) {
        this.winterTire = currentMonth <= 4 || currentMonth >= 11;
    }


    @Override
    public String toString() {
        return "Brand & Model: " + getBrand() + " " + getModel() +
                "\nProduction: " + getProductionCountry() + ", " + getProductionYear() +
                "\nEngine volume, L: " + engineVolume +
                "\nMaximum speed, km/h: " + getMaximumSpeed() +
                "\nBody color: " + getBodyColor() +
                "\nTransmission: " + transmission +
                "\nBody type: " + bodyType +
                "\nRegistration number: " + registrationNumber +
                "\nSeats amount: " + seatsAmount +
                "\nWinter tire: " + winterTire +
                "\nRemoteEngineStart: " + key.remoteEngineStart +
                "\nKeylessAccess: " + key.keylessAccess +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getProductionYear() == car.getProductionYear() && getMaximumSpeed() == car.getMaximumSpeed() && Double.compare(car.engineVolume, engineVolume) == 0 && seatsAmount == car.seatsAmount && winterTire == car.winterTire && Objects.equals(getBrand(), car.getBrand()) && Objects.equals(getModel(), car.getModel()) && Objects.equals(getProductionCountry(), car.getProductionCountry()) && Objects.equals(getBodyColor(), car.getBodyColor()) && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(key, car.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getProductionCountry(), getProductionYear(), engineVolume, getBodyColor(), getMaximumSpeed(), transmission, bodyType, registrationNumber, seatsAmount, winterTire, key);
    }


    private double validateEngineVolumeArgument(double engineVolume) {
        if (engineVolume <= 0) {
            return DEFAULT_ENGINE_VOLUME;
        } else {
            return engineVolume;
        }
    }
}
