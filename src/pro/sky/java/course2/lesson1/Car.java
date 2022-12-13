package pro.sky.java.course2.lesson1;

/**
 * @author Askar Gizatullin
 * @version 1.0
 */
public class Car {

    double engineVolume;
    int productionYear;
    String productionCountry;
    String brand;
    String model;
    String color;


    void getInfo() {
        System.out.println("Brand & Model: " + brand + " " + model + "\nProduction: " + productionCountry + ", " + productionYear + "\nEngine volume, L: " + engineVolume + "\nColor: " + color + "\n");
    }
}
