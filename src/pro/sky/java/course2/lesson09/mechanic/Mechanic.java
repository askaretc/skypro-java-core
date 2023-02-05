package pro.sky.java.course2.lesson09.mechanic;

import java.util.Objects;

public class Mechanic {

    private final String fullName;
    private String company;


    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }


    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public void service() {
        System.out.println("Maintenance is done!");
    }

    public void repair() {
        System.out.println("Repair is done!");
    }


    @Override
    public String toString() {
        return  fullName + ", " + company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(fullName, mechanic.fullName) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, company);
    }
}
