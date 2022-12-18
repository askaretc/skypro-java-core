package pro.sky.java.course2.lesson2.transport;

/**
 * @author Askar Gizatullin
 * @version 2.0
 */
public class Car {

    private static final String DEFAULT_VALUE = "default";
    private static final int DEFAULT_PRODUCTION_YEAR = 2000;
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private static final String DEFAULT_COLOR = "white";
    private static final String DEFAULT_TRANSMISSION = "manual gearbox";
    private static final String DEFAULT_BODY_TYPE = "sedan";
    private static final int DEFAULT_SEATS_AMOUNT = 5;

    private final String brand;
    private final String model;
    private final String productionCountry;
    private final int productionYear;
    private double engineVolume;
    private String color;

    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seatsAmount;
    private boolean winterTire;


    /**
     * Class constructor that creates a car with default values.
     */
    public Car() {
        brand = DEFAULT_VALUE;
        model = DEFAULT_VALUE;
        productionCountry = DEFAULT_VALUE;
        productionYear = DEFAULT_PRODUCTION_YEAR;
        engineVolume = DEFAULT_ENGINE_VOLUME;
        color = DEFAULT_COLOR;
        transmission = DEFAULT_TRANSMISSION;
        bodyType = DEFAULT_BODY_TYPE;
        registrationNumber = DEFAULT_VALUE;
        seatsAmount = DEFAULT_SEATS_AMOUNT;
        winterTire = false;
    }

    /**
     * Class constructor that creates a car by arguments.
     * The default value will be setting when the arguments are empty, null, or have an invalid value.
     *
     * @param brand              - brand
     * @param model              - model
     * @param productionCountry  - production country
     * @param productionYear     - production year
     * @param engineVolume       - engine capacity in liters
     * @param color              - car body color
     * @param transmission       - type of car transmission
     * @param bodyType           - car body type
     * @param registrationNumber - registration number
     * @param seatsAmount        - number of seats
     * @param winterTire         - availability of winter tires
     */
    public Car(String brand, String model, String productionCountry, int productionYear, double engineVolume, String color, String transmission, String bodyType, String registrationNumber, int seatsAmount, boolean winterTire) {
        this.brand = checkArgumentIsDefault(brand);
        this.model = checkArgumentIsDefault(model);
        this.productionCountry = checkArgumentIsDefault(productionCountry);
        if (productionYear <= 0) {
            this.productionYear = DEFAULT_PRODUCTION_YEAR;
        } else {
            this.productionYear = productionYear;
        }
        this.engineVolume = validateEngineVolumeArgument(engineVolume);
        this.color = validateColorArgument(color);
        this.transmission = validateTransmissionArgument(transmission);
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = DEFAULT_BODY_TYPE;
        } else {
            this.bodyType = bodyType;
        }
        this.registrationNumber = checkArgumentIsDefault(registrationNumber);
        if (seatsAmount <= 0) {
            this.seatsAmount = DEFAULT_SEATS_AMOUNT;
        } else {
            this.seatsAmount = seatsAmount;
        }
        this.winterTire = winterTire;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolumeArgument(engineVolume);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validateColorArgument(color);
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = validateTransmissionArgument(transmission);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isWinterTire() {
        return winterTire;
    }

    public void setWinterTire(boolean winterTire) {
        this.winterTire = winterTire;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    /**
     * The method sets the <code>winterTire</code> to true or false according to current season.
     *
     * @param currentMonth - current month
     */
    public void setSeasonTire(int currentMonth) {
        this.winterTire = currentMonth <= 4 || currentMonth >= 11;
    }


    private String checkArgumentIsDefault(String str) {
        if (str == null || str.isEmpty() || str.isBlank()) {
            return DEFAULT_VALUE;
        } else {
            return str;
        }
    }

    private double validateEngineVolumeArgument(double engineVolume) {
        if (engineVolume <= 0) {
            return DEFAULT_ENGINE_VOLUME;
        } else {
            return engineVolume;
        }
    }

    private String validateColorArgument(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            return DEFAULT_COLOR;
        } else {
            return color;
        }
    }

    private String validateTransmissionArgument(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            return DEFAULT_TRANSMISSION;
        } else {
            return transmission;
        }
    }


    @Override
    public String toString() {
        return "Brand & Model: " + brand + " " + model +
                "\nProduction: " + productionCountry + ", " + productionYear +
                "\nEngine volume, L: " + engineVolume +
                "\nColor: " + color +
                "\nTransmission: " + transmission +
                "\nBody type: " + bodyType +
                "\nRegistration number: " + registrationNumber +
                "\nSeats amount: " + seatsAmount +
                "\nWinter tire: " + winterTire +
                "\n";
    }
}
