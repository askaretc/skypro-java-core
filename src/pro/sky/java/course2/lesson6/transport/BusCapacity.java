package pro.sky.java.course2.lesson6.transport;

public enum BusCapacity {

    ESPECIALLY_SMALL(0, 10),
    SMALL(0, 25),
    AVERAGE(40, 50),
    LARGE(60, 80),
    ESPECIALLY_LARGE(100, 120);

    private final int lowerLimit;
    private final int upperLimit;


    BusCapacity(int lowerLimit, int upperLimit) {
        if (lowerLimit >= 0 && upperLimit >= 0) {
            this.lowerLimit = lowerLimit;
            this.upperLimit = upperLimit;
        } else {
            throw new IllegalArgumentException("Limits should be positive");
        }
    }


    public int getLowerLimit() {
        return lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }


    @Override
    public String toString() {
        if (lowerLimit == 0) {
            return "Вместимость: до " + getUpperLimit() + " мест";
        } else {
            return "Вместимость: " + getLowerLimit() + "-" + getUpperLimit() + " мест";
        }
    }
}
