package pro.sky.java.course2.lesson5;

import pro.sky.java.course2.lesson5.driver.DriverB;
import pro.sky.java.course2.lesson5.driver.DriverC;
import pro.sky.java.course2.lesson5.driver.DriverD;
import pro.sky.java.course2.lesson5.transport.Bus;
import pro.sky.java.course2.lesson5.transport.Car;
import pro.sky.java.course2.lesson5.transport.Truck;
import pro.sky.java.course2.lesson5.transport.CarBodyType;
import pro.sky.java.course2.lesson5.transport.BusCapacity;
import pro.sky.java.course2.lesson5.transport.TruckCapacityType;

/**
 * @author Askar Gizatullin
 * @version 5.0
 */
public class Program {
    public static void main(String[] args) {

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


        car1.setCarBodyType(CarBodyType.SEDAN);
        car1.printType();
        car2.printType();

        truck1.setTruckCapacityType(TruckCapacityType.N2);
        truck1.printType();
        truck2.printType();

        bus1.setBusCapacity(BusCapacity.LARGE);
        bus1.printType();
        bus2.printType();
    }
}
