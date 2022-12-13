package pro.sky.java.course2.lesson1;

/**
 * @author Askar Gizatullin
 * @version 1.1
 */
public class Human {

    int yearOfBirth;
    String name;
    String town;
    String job;


    /**
     * @since 1.0
     */
    Human() {

    }

    /**
     * @since 1.1
     */
    Human(String name, String town, int yearOfBirth, String job) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.job = job;
    }


    void getAcquainted() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(-ась) в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
