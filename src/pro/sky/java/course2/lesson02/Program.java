package pro.sky.java.course2.lesson02;

import pro.sky.java.course2.lesson02.transport.Car;

import java.time.LocalDate;

/**
 * @author Askar Gizatullin
 * @version 2.1
 */
public class Program {

    private static final int CURRENT_MONTH = LocalDate.now().getMonthValue();

    public static void main(String[] args) {

        ////////// Task 1 & 2 //////////

        System.out.println("Task 1 & 2\n");

        Car car1 = new Car("Audi", "A8 50 L TDI quattro", "Germany", 2020, 3.0, "black", "automatic gearbox", "sedan", "A 777 AA 777", 5, false, true, true);
        System.out.println(car1);
        car1.setSeasonTire(CURRENT_MONTH);
        System.out.println(car1);

        Car car2 = new Car("Kia", "Sportage 4 generation", "South Korea", 2018, 2.4, "red", "", "", null, -7, true, true, false);
        System.out.println(car2);
        car2.setTransmission("automatic gearbox");
        car2.setRegistrationNumber("X 198 XX 198");
        System.out.println(car2);

        Car car3 = new Car();
        System.out.println(car3);
        car3.setEngineVolume(2.0);
        car3.setColor("yellow");
        car3.setTransmission("automatic gearbox");
        car3.setRegistrationNumber("O 116 OO 116");
        car3.setWinterTire(true);
        System.out.println(car3);
    }
}
