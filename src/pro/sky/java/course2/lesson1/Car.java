package pro.sky.java.course2.lesson1;

/**
 * @author Askar Gizatullin
 * @version 1.2
 */
public class Car {

    double engineVolume;
    int productionYear;
    String productionCountry;
    String brand;
    String model;
    String color;


    /**
     * @since 1.0
     */
    Car() {
        String defaultValue = "default";
        model = defaultValue;
        brand = defaultValue;
        productionCountry = defaultValue;
        engineVolume = 1.5;
        color = "white";
        productionYear = 2000;
    }

    /**
     * @since 1.1
     */
    public Car(String brand, String model, String productionCountry, int productionYear, double engineVolume, String color) {
        this.brand = brand;
        this.model = model;
        this.productionCountry = productionCountry;
        this.productionYear = productionYear;
        this.engineVolume = engineVolume;
        this.color = color;
    }


    void getInfo() {
        System.out.println("Brand & Model: " + brand + " " + model + "\nProduction: " + productionCountry + ", " + productionYear + "\nEngine volume, L: " + engineVolume + "\nColor: " + color + "\n");
    }
}
