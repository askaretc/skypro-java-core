package pro.sky.java.course2.lesson8.driver;

public enum DriverLicenseCategory {
    A("A"), B("B"), C("C"), D("D"), M("M");

    private final String category;

    DriverLicenseCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
