package pro.sky.java.course2.lesson03;

import java.time.LocalDate;

/**
 * @author Askar Gizatullin
 * @version 3.0
 */
public class Program {

    private static final int CURRENT_MONTH = LocalDate.now().getMonthValue();

    public static void main(String[] args) {

        ////////// TASK 1 //////////

        System.out.println("TASK 1\n");

        Car car1 = new Car("Audi", "A8 50 L TDI quattro", "Germany", 2020, 3.0, 330, "black", "automatic gearbox", "sedan", "A 777 AA 777", 5, false, true, true);
        System.out.println("----------before the changes----------\n" + car1);
        car1.setSeasonTire(CURRENT_MONTH);
        System.out.println("----------after the changes----------\n" + car1);

        Car car2 = new Car("Kia", "Sportage 4 generation", "South Korea", 2018, 2.4, 0, "", "", "", null, 0, false, true, false);
        System.out.println("----------before the changes----------\n" + car2);
        car2.setMaximumSpeed(222);
        car2.setBodyColor("red");
        car2.setTransmission("automatic gearbox");
        car2.setRegistrationNumber("X 198 XX 198");
        car2.setSeasonTire(CURRENT_MONTH);
        System.out.println("----------after the changes----------\n" + car2);

        Car car3 = new Car();
        System.out.println("----------before the changes----------\n" + car3);
        car3.setEngineVolume(2.0);
        car3.setMaximumSpeed(200);
        car3.setBodyColor("yellow");
        car3.setTransmission("automatic gearbox");
        car3.setRegistrationNumber("O 116 OO 116");
        car3.setWinterTire(true);
        System.out.println("----------after the changes----------\n" + car3);


        ////////// TASK 2 //////////

        System.out.println("===============================================================================\nTASK 2\n");

        Bus bus1 = new Bus("Mercedes-Benz", "Travego", "Germany", 2019, "silver", 128);
        System.out.println(bus1);

        Bus bus2 = new Bus("Volkswagen", "Transporter (T4)", "Germany", 2003, "green", 96);
        System.out.println(bus2);

        Bus bus3 = new Bus("Ford", "Transit", "USA", 0, "", 0);
        System.out.println("----------before the changes----------\n" + bus3);
        bus3.setBodyColor("black");
        bus3.setMaximumSpeed(111);
        System.out.println("----------after the changes----------\n" + bus3);
    }
}
