package pro.sky.java.course2.lesson4.driver;

public abstract class Driver {

    private final String fullName;
    private boolean driverLicense;
    private int workExperience;


    public Driver(String fullName, boolean driverLicense, int workExperience) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.workExperience = workExperience;
    }


    public String getFullName() {
        return fullName;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }


    public void startMoving() {
        System.out.println(getFullName() + " started moving.");
    }

    public void stop() {
        System.out.println(getFullName() + " stopped.");
    }

    public void refuelTheTransport() {
        System.out.println(getFullName() + " refueled the transport.");
    }
}
