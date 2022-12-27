package pro.sky.java.course2.lesson4;

import pro.sky.java.course2.lesson4.driver.DriverB;
import pro.sky.java.course2.lesson4.driver.DriverC;
import pro.sky.java.course2.lesson4.driver.DriverD;
import pro.sky.java.course2.lesson4.transport.Bus;
import pro.sky.java.course2.lesson4.transport.Car;
import pro.sky.java.course2.lesson4.transport.Truck;

/**
 * @author Askar Gizatullin
 * @version 4.0
 */
public class Program {
    public static void main(String[] args) {

        ////////// TASK 4 //////////

        DriverB driverB1 = new DriverB("Karley Drake", true, 7);
        DriverB driverB2 = new DriverB("Kingston Crosby", true, 10);
        DriverB driverB3 = new DriverB("Patrick Robbins", true, 12);
        DriverB driverB4 = new DriverB("Jayce Mosley", true, 5);

        DriverC driverC1 = new DriverC("Jordin Cooke", true, 19);
        DriverC driverC2 = new DriverC("Raiden Good", true, 17);
        DriverC driverC3 = new DriverC("Braeden Johnston", true, 18);
        DriverC driverC4 = new DriverC("Marcus Hatfield", true, 20);

        DriverD driverD1 = new DriverD("Marco Marshall", true, 14);
        DriverD driverD2 = new DriverD("Todd Guerra", true, 12);
        DriverD driverD3 = new DriverD("Maximillian Richmond", true, 16);
        DriverD driverD4 = new DriverD("Simon Bryant", true, 10);


        Car<DriverB> car1 = new Car<>("Audi", "R8", 4.2, driverB1);
        Car<DriverB> car2 = new Car<>("Bugatti", "Veyron", 8.0, driverB2);
        Car<DriverB> car3 = new Car<>("Dodge", "Viper", 8.4, driverB3);
        Car<DriverB> car4 = new Car<>("Mercedes Benz", "SLS AMG", 6.2, driverB4);

        Truck<DriverC> truck1 = new Truck<>("KamAZ", "4326", 10.85, driverC1);
        Truck<DriverC> truck2 = new Truck<>("Tata", "Prima T1", 12.0, driverC2);
        Truck<DriverC> truck3 = new Truck<>("МАЗ", "6440RR", 12.5, driverC3);
        Truck<DriverC> truck4 = new Truck<>("MAN", "TGS", 12.0, driverC4);

        Bus<DriverD> bus1 = new Bus<>("Mercedes-Benz", "Travego", 12.8, driverD1);
        Bus<DriverD> bus2 = new Bus<>("Mercedes-Benz", "Tourino", 12.0, driverD2);
        Bus<DriverD> bus3 = new Bus<>("Mercedes-Benz", "Tourismo", 12.0, driverD3);
        Bus<DriverD> bus4 = new Bus<>("Mercedes-Benz", "OC 500 LE", 12.0, driverD4);


        car1.printDriverStartingInformation();
        car2.printDriverStartingInformation();
        car3.printDriverStartingInformation();
        car4.printDriverStartingInformation();

        System.out.println("-----------------------------------------------------------------------------------------");

        truck1.printDriverStartingInformation();
        truck2.printDriverStartingInformation();
        truck3.printDriverStartingInformation();
        truck4.printDriverStartingInformation();

        System.out.println("-----------------------------------------------------------------------------------------");

        bus1.printDriverStartingInformation();
        bus2.printDriverStartingInformation();
        bus3.printDriverStartingInformation();
        bus4.printDriverStartingInformation();


        ////////// TASK 3 //////////

        /*System.out.println("===============================================================================\nTASK 3\n");

        car1.setAmountOfPitStop(1);
        car1.setMinutesOfBestLapTime(10);
        car1.setMaximumSpeed(321);

        car2.setAmountOfPitStop(2);
        car2.setMinutesOfBestLapTime(9);
        car2.setMaximumSpeed(350);

        car3.setAmountOfPitStop(1);
        car3.setMinutesOfBestLapTime(12);
        car3.setMaximumSpeed(299);

        car4.setAmountOfPitStop(0);
        car4.setMinutesOfBestLapTime(11);
        car4.setMaximumSpeed(311);


        truck1.setAmountOfPitStop(0);
        truck1.setMinutesOfBestLapTime(20);
        truck1.setMaximumSpeed(189);

        truck2.setAmountOfPitStop(2);
        truck2.setMinutesOfBestLapTime(32);
        truck2.setMaximumSpeed(136);

        truck3.setAmountOfPitStop(1);
        truck3.setMinutesOfBestLapTime(22);
        truck3.setMaximumSpeed(164);

        truck4.setAmountOfPitStop(1);
        truck4.setMinutesOfBestLapTime(25);
        truck4.setMaximumSpeed(150);


        bus1.setAmountOfPitStop(1);
        bus1.setMinutesOfBestLapTime(30);
        bus1.setMaximumSpeed(120);

        bus2.setAmountOfPitStop(1);
        bus2.setMinutesOfBestLapTime(33);
        bus2.setMaximumSpeed(111);

        bus3.setAmountOfPitStop(1);
        bus3.setMinutesOfBestLapTime(25);
        bus3.setMaximumSpeed(115);

        bus4.setAmountOfPitStop(2);
        bus4.setMinutesOfBestLapTime(35);
        bus4.setMaximumSpeed(100);


        System.out.println("CARS\n");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        System.out.println("-------------------------------------------------------------------------------\n");
        System.out.println("TRUCKS\n");

        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);

        System.out.println("-------------------------------------------------------------------------------\n");
        System.out.println("BUSES\n");

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);*/
    }
}
