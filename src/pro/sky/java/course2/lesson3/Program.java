package pro.sky.java.course2.lesson3;

import java.time.LocalDate;

/**
 * @author Askar Gizatullin
 * @version 3.0
 */
public class Program {

    private static final int CURRENT_MONTH = LocalDate.now().getMonthValue();

    public static void main(String[] args) {

        ////////// Task 1 //////////

        System.out.println("Task 1\n");

        Car car1 = new Car("Audi", "A8 50 L TDI quattro", "Germany", 2020, 3.0, 330, "black", "automatic gearbox", "sedan", "A 777 AA 777", 5, false, true, true);
        System.out.println(car1);
        car1.setSeasonTire(CURRENT_MONTH);
        System.out.println(car1);

        Car car2 = new Car("Kia", "Sportage 4 generation", "South Korea", 2018, 2.4, 250, "", "", "", null, -7, true, true, false);
        System.out.println(car2);
        car2.setTransmission("automatic gearbox");
        car2.setRegistrationNumber("X 198 XX 198");
        System.out.println(car2);

        Car car3 = new Car();
        System.out.println(car3);
        car3.setEngineVolume(2.0);
        car3.setMaximumSpeed(200);
        car3.setBodyColor("yellow");
        car3.setTransmission("automatic gearbox");
        car3.setRegistrationNumber("O 116 OO 116");
        car3.setWinterTire(true);
        System.out.println(car3);
    }
}
