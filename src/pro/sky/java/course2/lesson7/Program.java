package pro.sky.java.course2.lesson7;

import pro.sky.java.course2.lesson7.driver.Driver;
import pro.sky.java.course2.lesson7.driver.DriverB;
import pro.sky.java.course2.lesson7.driver.DriverC;
import pro.sky.java.course2.lesson7.driver.DriverD;
import pro.sky.java.course2.lesson7.mechanic.Mechanic;
import pro.sky.java.course2.lesson7.transport.Transport;
import pro.sky.java.course2.lesson7.transport.bus.Bus;
import pro.sky.java.course2.lesson7.transport.car.Car;
import pro.sky.java.course2.lesson7.transport.truck.Truck;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Askar Gizatullin
 * @version 7.0
 */
public class Program {
    public static void main(String[] args) {

        List<Driver> driverList = new ArrayList<>();

        DriverB driverB1 = new DriverB("Karley Drake", true, 7, "B");
        DriverB driverB2 = new DriverB("Kingston Crosby", true, 10, "B");
        DriverB driverB3 = new DriverB("Patrick Robbins", true, 12, "B");
        DriverB driverB4 = new DriverB("Jayce Mosley", true, 5, "B");

        DriverC driverC1 = new DriverC("Jordin Cooke", true, 19, "C");
        DriverC driverC2 = new DriverC("Raiden Good", true, 17, "C");
        DriverC driverC3 = new DriverC("Braeden Johnston", true, 18, "C");
        DriverC driverC4 = new DriverC("Marcus Hatfield", true, 20, "C");

        DriverD driverD1 = new DriverD("Marco Marshall", true, 14, "D");
        DriverD driverD2 = new DriverD("Todd Guerra", true, 12, "D");
        DriverD driverD3 = new DriverD("Maximillian Richmond", true, 16, "D");
        DriverD driverD4 = new DriverD("Simon Bryant", true, 10, "D");

        driverList.add(driverB1);
        driverList.add(driverB2);
        driverList.add(driverB3);
        driverList.add(driverB4);
        driverList.add(driverC1);
        driverList.add(driverC2);
        driverList.add(driverC3);
        driverList.add(driverC4);
        driverList.add(driverD1);
        driverList.add(driverD2);
        driverList.add(driverD3);
        driverList.add(driverD4);


        Mechanic mechanic1 = new Mechanic("Jeffrey Adams", "Tesla");
        Mechanic mechanic2 = new Mechanic("Jamie Wallace", "Tesla");
        Mechanic mechanic3 = new Mechanic("John Nelson", "Ford Motor Company");
        Mechanic mechanic4 = new Mechanic("Gary Maxwell", "Ferrari NV");
        Mechanic mechanic5 = new Mechanic("James Johnson", "Mercedes-Benz");
        Mechanic mechanic6 = new Mechanic("Daniel Gibson", "Mercedes-Benz");
        Mechanic mechanic7 = new Mechanic("Edward Grant", "Mercedes-Benz");
        Mechanic mechanic8 = new Mechanic("Larry Saunders", "BMW AG");


        List<Transport> transportList = new ArrayList<>();

        Car<DriverB> car1 = new Car<>("Audi", "R8", 4.2, driverB1,
                new Mechanic[]{mechanic1, mechanic2});
        Car<DriverB> car2 = new Car<>("Bugatti", "Veyron", 8.0, driverB2,
                new Mechanic[]{mechanic3, mechanic4, mechanic8});
        Car<DriverB> car3 = new Car<>("Dodge", "Viper", 8.4, driverB3,
                new Mechanic[]{mechanic3, mechanic8});
        Car<DriverB> car4 = new Car<>("Mercedes Benz", "SLS AMG", 3.2, driverB4,
                new Mechanic[]{mechanic5, mechanic6, mechanic7});

        Truck<DriverC> truck1 = new Truck<>("KamAZ", "4326", 10.85, driverC1,
                new Mechanic[]{mechanic3, mechanic6, mechanic8});
        Truck<DriverC> truck2 = new Truck<>("Tata", "Prima T1", 9.0, driverC2,
                new Mechanic[]{mechanic1, mechanic2});
        Truck<DriverC> truck3 = new Truck<>("МАZ", "6440RR", 12.5, driverC3,
                new Mechanic[]{mechanic3, mechanic8});
        Truck<DriverC> truck4 = new Truck<>("MAN", "TGS", 12.0, driverC4,
                new Mechanic[]{mechanic5, mechanic6, mechanic7});

        Bus<DriverD> bus1 = new Bus<>("Mercedes-Benz", "Travego", 12.8, driverD1,
                new Mechanic[]{mechanic5, mechanic6, mechanic7});
        Bus<DriverD> bus2 = new Bus<>("Mercedes-Benz", "Tourino", 12.0, driverD2,
                new Mechanic[]{mechanic5, mechanic6, mechanic7});
        Bus<DriverD> bus3 = new Bus<>("Mercedes-Benz", "Tourismo", 12.0, driverD3,
                new Mechanic[]{mechanic5, mechanic6, mechanic7});
        Bus<DriverD> bus4 = new Bus<>("Mercedes-Benz", "OC 500 LE", 12.0, driverD4,
                new Mechanic[]{mechanic5, mechanic6, mechanic7});

        transportList.add(car1);
        transportList.add(car2);
        transportList.add(car3);
        transportList.add(car4);
        transportList.add(truck1);
        transportList.add(truck2);
        transportList.add(truck3);
        transportList.add(truck4);
        transportList.add(bus1);
        transportList.add(bus2);
        transportList.add(bus3);
        transportList.add(bus4);


        car1.printCarTeamInformation();
        bus2.printCarTeamInformation();
        truck3.printCarTeamInformation();

        //checkTransportsDiagnostics(car1, car2, car3, car4, truck1, truck2, truck3, truck4, bus1, bus2, bus3, bus4);
    }

    public static void checkTransportDiagnostics(Transport transport) {
        try {
            if (!transport.passDiagnostics()) {
                throw new RuntimeException("The " + transport.getBrand() + " " + transport.getModel() +
                        " has not passed diagnostics");
            } else {
                System.out.println("The " + transport.getBrand() + " " + transport.getModel() + " passed diagnostics");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkTransportsDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            checkTransportDiagnostics(transport);
        }
    }
}
