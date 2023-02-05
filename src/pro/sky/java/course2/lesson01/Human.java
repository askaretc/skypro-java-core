package pro.sky.java.course2.lesson01;

import java.util.Objects;

/**
 * @author Askar Gizatullin
 * @version 1.2
 */
public class Human {

    int yearOfBirth;
    String name;
    String town;
    String job;


    public Human() {

    }

    public Human(String name, String town, int yearOfBirth, String job) {
        if (validateStringArgument(name)) {
            this.name = name;
        }
        if (validateStringArgument(town)) {
            this.town = town;
        }
        this.yearOfBirth = Math.max(yearOfBirth, 0);
        if (validateStringArgument(job)) {
            this.job = job;
        }
    }


    private boolean validateStringArgument(String str) {
        return str != null && !str.isEmpty() && !str.isBlank();
    }

    public void getAcquainted() {
        if (name == null || town == null || job == null) {
            System.out.println("Информация не указана");
        } else {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(-ась) в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth && Objects.equals(name, human.name) && Objects.equals(town, human.town) && Objects.equals(job, human.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, name, town, job);
    }
}
