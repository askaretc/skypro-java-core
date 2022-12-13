package pro.sky.java.course2.lesson1;

/**
 * @author Askar Gizatullin
 * @version 1.0
 */
public class Human {

    int yearOfBirth;
    String name;
    String town;
    String job;


    void getAcquainted() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(-ась) в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
