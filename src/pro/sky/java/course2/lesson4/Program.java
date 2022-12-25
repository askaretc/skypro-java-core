package pro.sky.java.course2.lesson4;

/**
 * @author Askar Gizatullin
 * @version 4.0
 */
public class Program {
    public static void main(String[] args) {

        ////////// TASK 1 //////////

        Car car1 = new Car("Audi", "R8", 4.2);
        Car car2 = new Car("Bugatti", "Veyron", 8.0);
        Car car3 = new Car("Dodge", "Viper", 8.4);
        Car car4 = new Car("Mercedes Benz", "SLS AMG", 6.2);

        Truck truck1 = new Truck("KamAZ", "4326", 10.85);
        Truck truck2 = new Truck("Tata", "Prima T1", 12.0);
        Truck truck3 = new Truck("МАЗ", "6440RR", 12.5);
        Truck truck4 = new Truck("MAN", "TGS", 12.0);

        Bus bus1 = new Bus("Mercedes-Benz", "Travego", 12.8);
        Bus bus2 = new Bus("Mercedes-Benz", "Tourino", 12.0);
        Bus bus3 = new Bus("Mercedes-Benz", "Tourismo", 12.0);
        Bus bus4 = new Bus("Mercedes-Benz", "OC 500 LE", 12.0);


        ////////// TASK 3 //////////

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

        System.out.println("=======================================================================================\n");
        System.out.println("TRUCKS\n");

        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);

        System.out.println("=======================================================================================\n");
        System.out.println("BUSES\n");

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);
    }
}
