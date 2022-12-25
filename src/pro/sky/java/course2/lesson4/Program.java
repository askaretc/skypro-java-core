package pro.sky.java.course2.lesson4;

/**
 * @author Askar Gizatullin
 * @version 4.0
 */
public class Program {
    public static void main(String[] args) {

        ////////// TASK 1 //////////

        System.out.println("TASK 1\n");

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
    }
}
