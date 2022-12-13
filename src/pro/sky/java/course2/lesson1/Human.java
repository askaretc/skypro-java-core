package pro.sky.java.course2.lesson1;

/**
 * @author Askar Gizatullin
 * @version 1.2
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
        this.yearOfBirth = Math.max(yearOfBirth, 0);
        this.job = job;
    }


    void getAcquainted() {
        if (name == null || town == null || job == null) {
            System.out.println("Информация не указана");
        } else {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(-ась) в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
        }
    }
}
