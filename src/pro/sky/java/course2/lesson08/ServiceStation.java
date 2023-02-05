package pro.sky.java.course2.lesson08;

import pro.sky.java.course2.lesson08.driver.DriverB;
import pro.sky.java.course2.lesson08.driver.DriverC;
import pro.sky.java.course2.lesson08.transport.Transport;
import pro.sky.java.course2.lesson08.transport.car.Car;
import pro.sky.java.course2.lesson08.transport.truck.Truck;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport> transportQueue = new LinkedList<>();


    public Queue<Transport> getTransportQueue() {
        return transportQueue;
    }


    public void addAutomobile (Car<DriverB> car) {
        transportQueue.offer(car);
    }

    public void addAutomobile (Truck<DriverC> truck) {
        transportQueue.offer(truck);
    }

    public void conductTechnicalInspection () {
        checkTransportDiagnostics(transportQueue.poll());
    }


    private static void checkTransportDiagnostics(Transport transport) {
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
}
