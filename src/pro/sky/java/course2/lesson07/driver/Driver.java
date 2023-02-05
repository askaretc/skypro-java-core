package pro.sky.java.course2.lesson07.driver;

public abstract class Driver {

    private final String fullName;
    private boolean driverLicense;
    private int workExperience;
    private String category;


    public Driver(String fullName, boolean driverLicense, int workExperience, String category) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.workExperience = workExperience;
        if (checkCategoryAvailability(category) && validateCategoryArgument(category)) {
            this.category = category;
        }
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (checkCategoryAvailability(category)) {
            this.category = category;
        }
    }


    public void startMoving() {
        System.out.println(getFullName() + " started moving");
    }

    public void stop() {
        System.out.println(getFullName() + " stopped");
    }

    public void refuelTheTransport() {
        System.out.println(getFullName() + " refueled the transport");
    }


    private boolean checkCategoryAvailability (String category) {
        if(category == null || category.isEmpty() || category.isBlank()) {
            throw new IllegalArgumentException("You must specify the category of driver's license!");
        } else {
            return true;
        }
    }

    private boolean validateCategoryArgument (String category) {
        String[] categories = new String[DriverLicenseCategory.values().length];
        for (int i = 0; i < categories.length; i++) {
            categories[i] = DriverLicenseCategory.values()[i].getCategory();
        }
        for (String s : categories) {
            if (s.equals(category)) {
                return true;
            }
        }
        throw new IllegalArgumentException("There is no such category of driver's license!");
    }
}
