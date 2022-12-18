package pro.sky.java.course2.lesson1;

import java.util.Objects;

/**
 * @author Askar Gizatullin
 * @version 1.2
 */
public class Car {

    static final String DEFAULT_VALUE = "default";
    static final int DEFAULT_PRODUCTION_YEAR = 2000;
    static final double DEFAULT_ENGINE_VOLUME = 1.5;
    static final String DEFAULT_COLOR = "white";

    String model;
    String brand;
    String productionCountry;
    int productionYear;
    double engineVolume;
    String color;


    public Car() {
        model = DEFAULT_VALUE;
        brand = DEFAULT_VALUE;
        productionCountry = DEFAULT_VALUE;
        engineVolume = DEFAULT_ENGINE_VOLUME;
        color = DEFAULT_COLOR;
        productionYear = DEFAULT_PRODUCTION_YEAR;
    }

    public Car(String brand, String model, String productionCountry, int productionYear, double engineVolume, String color) {
        this.brand = checkArgumentIsDefault(brand);
        this.model = checkArgumentIsDefault(model);
        this.productionCountry = checkArgumentIsDefault(productionCountry);
        if (productionYear <= 0) {
            this.productionYear = DEFAULT_PRODUCTION_YEAR;
        } else {
            this.productionYear = productionYear;
        }
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }


    private String checkArgumentIsDefault(String str) {
        if (str == null || str.isEmpty() || str.isBlank()) {
            return DEFAULT_VALUE;
        } else {
            return str;
        }
    }


    @Override
    public String toString() {
        return "Brand & Model: " + brand + " " + model +
                "\nProduction: " + productionCountry + ", " + productionYear +
                "\nEngine volume, L: " + engineVolume +
                "\nColor: " + color + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && productionYear == car.productionYear && Objects.equals(productionCountry, car.productionCountry) && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineVolume, productionYear, productionCountry, brand, model, color);
    }
}
