package pro.sky.java.course2.lesson7.mechanic;

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
}
