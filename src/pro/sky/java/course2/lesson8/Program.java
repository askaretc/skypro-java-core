package pro.sky.java.course2.lesson8;

import pro.sky.java.course2.lesson8.ServiceStation;
import pro.sky.java.course2.lesson8.driver.Driver;
import pro.sky.java.course2.lesson8.driver.DriverB;
import pro.sky.java.course2.lesson8.driver.DriverC;
import pro.sky.java.course2.lesson8.driver.DriverD;
import pro.sky.java.course2.lesson8.mechanic.Mechanic;
import pro.sky.java.course2.lesson8.transport.Transport;
import pro.sky.java.course2.lesson8.transport.bus.Bus;
import pro.sky.java.course2.lesson8.transport.car.Car;
import pro.sky.java.course2.lesson8.transport.truck.Truck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Askar Gizatullin
 * @version 7.0
 */
public class Program {
    public static void main(String[] args) {

        ////////// TASK 1 //////////
        //System.out.println("TASK 1\n");

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


        /*car1.printCarTeamInformation();
        bus2.printCarTeamInformation();
        truck3.printCarTeamInformation();


        ////////// TASK 2 //////////
        System.out.println("===============================================================================\nTASK 2\n");

        ServiceStation serviceStation = new ServiceStation();

        serviceStation.addAutomobile(car1);
        serviceStation.addAutomobile(car2);
        serviceStation.addAutomobile(car3);
        serviceStation.addAutomobile(truck1);

        System.out.println("Queue before Technical Inspection:\n");

        System.out.println(serviceStation.getTransportQueue());

        System.out.println("\n");

        serviceStation.conductTechnicalInspection();

        System.out.println("\n\nQueue after Technical Inspection:\n");

        System.out.println(serviceStation.getTransportQueue());*/


        Map<Transport, Mechanic> transportMechanicMap = new HashMap<>();

        transportMechanicMap.put(car1, mechanic1);
        transportMechanicMap.put(car1, mechanic1);
        transportMechanicMap.put(car2, mechanic2);
        transportMechanicMap.put(truck1, mechanic5);
        transportMechanicMap.put(truck2, mechanic6);
        transportMechanicMap.put(truck2, mechanic6);

        for (Map.Entry<Transport, Mechanic> entry : transportMechanicMap.entrySet()) {
            System.out.println(entry.getKey().getBrand() + " " + entry.getKey().getModel() + "'s Mechanic: " +
                    entry.getValue());
        }
    }
}
