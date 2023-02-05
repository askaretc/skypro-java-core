package pro.sky.java.course2.lesson01;

/**
 * @author Askar Gizatullin
 * @version 1.2
 */
public class Program {
    public static void main(String[] args) {

        ////////// HOMEWORK 1 //////////
        ////////// Task 1 & 2 //////////

        System.out.println("HOMEWORK 1");
        System.out.println("Task 1 & 2\n");

        Human human1 = new Human();
        human1.name = "Максим";
        human1.town = "Минск";
        human1.yearOfBirth = 1987;
        human1.job = "Бренд-менеджер";
        human1.getAcquainted();

        Human human2 = new Human();
        human2.name = "Аня";
        human2.town = "Москва";
        human2.yearOfBirth = 1993;
        human2.job = "Методист образовательных программ";
        human2.getAcquainted();

        Human human3 = new Human();
        human3.name = "Катя";
        human3.town = "Калиниград";
        human3.yearOfBirth = 1994;
        human3.job = "Продакт-менеджер";
        human3.getAcquainted();

        Human human4 = new Human();
        human4.name = "Артем";
        human4.town = "Москва";
        human4.yearOfBirth = 1995;
        human4.job = "Директор по развитию бизнеса";
        human4.getAcquainted();

        System.out.println();


        ////////// Task 3 //////////

        System.out.println("Task 3\n");

        Car car1 = new Car();
        car1.brand = "Lada";
        car1.model = "Grande";
        car1.productionCountry = "Russia";
        car1.productionYear = 2015;
        car1.engineVolume = 1.7;
        car1.color = "yellow";
        System.out.println(car1);

        Car car2 = new Car();
        car2.brand = "Audi";
        car2.model = "A8 50 L TDI quattro";
        car2.productionCountry = "Germany";
        car2.productionYear = 2020;
        car2.engineVolume = 3.0;
        car2.color = "black";
        System.out.println(car2);

        Car car3 = new Car();
        car3.brand = "BMW";
        car3.model = "Z8";
        car3.productionCountry = "Germany";
        car3.productionYear = 2021;
        car3.engineVolume = 3.0;
        car3.color = "black";
        System.out.println(car3);

        Car car4 = new Car();
        car4.brand = "Kia";
        car4.model = "Sportage 4 generation";
        car4.productionCountry = "South Korea";
        car4.productionYear = 2018;
        car4.engineVolume = 2.4;
        car4.color = "red";
        System.out.println(car4);

        Car car5 = new Car();
        car5.brand = "Hyundai";
        car5.model = "Avante";
        car5.productionCountry = "South Korea";
        car5.productionYear = 2016;
        car5.engineVolume = 1.6;
        car5.color = "orange";
        System.out.println(car5);

        System.out.println();


        ////////// HOMEWORK 2 //////////
        ////////// Task 1 //////////

        System.out.println("HOMEWORK 2");
        System.out.println("Task 1\n");

        Human human5 = new Human("Максим", "Минск", 1987, "Бренд-менеджер");
        human5.getAcquainted();

        Human human6 = new Human("Аня", "Москва", 1993, "Методист образовательных программ");
        human6.getAcquainted();

        Human human7 = new Human("Катя", "Калиниград", 1994, "Продакт-менеджер");
        human7.getAcquainted();

        Human human8 = new Human("Артем", "Москва", 1995, "Директор по развитию бизнеса");
        human8.getAcquainted();

        System.out.println();


        ////////// Task 2 //////////

        System.out.println("Task 2\n");

        Car car6 = new Car("Lada", "Grande", "Russia", 2015, 1.7, "yellow");
        System.out.println(car6);

        Car car7 = new Car("Audi", "A8 50 L TDI quattro", "Germany", 2020, 3.0, "black");
        System.out.println(car7);

        Car car8 = new Car("BMW", "Z8", "Germany", 2021, 3.0, "black");
        System.out.println(car8);

        Car car9 = new Car("Kia", "Sportage 4 generation", "South Korea", 2018, 2.4, "red");
        System.out.println(car9);

        Car car10 = new Car("Hyundai", "Avante", "South Korea", 2016, 1.6, "orange");
        System.out.println(car10);

        System.out.println();


        ////////// HOMEWORK 3 //////////
        ////////// Task 1 //////////

        System.out.println("HOMEWORK 3");
        System.out.println("Task 1\n");

        Human human9 = new Human("Петя", "Санкт-Петербург", -1992, "Инженер");
        human9.getAcquainted();

        Human human10 = new Human();
        human10.getAcquainted();

        Human human11 = new Human("Владимир", "", 0, "");
        human11.getAcquainted();

        System.out.println();


        ////////// Task 2 //////////

        System.out.println("Task 2\n");

        Car car11 = new Car();
        System.out.println(car11);

        Car car12 = new Car("Ford", "", "USA", 0, 0,"");
        System.out.println(car12);
    }
}
