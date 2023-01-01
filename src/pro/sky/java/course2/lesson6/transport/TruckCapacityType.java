package pro.sky.java.course2.lesson6.transport;

public enum TruckCapacityType {

    N1(0, 3.5f), N2(3.5f, 12), N3(12, 0);

    private final float lowerLimit;
    private final float upperLimit;


    TruckCapacityType(float lowerLimit, float upperLimit) {
        if (lowerLimit >= 0 && upperLimit >= 0) {
            this.lowerLimit = lowerLimit;
            this.upperLimit = upperLimit;
        } else {
            throw new IllegalArgumentException("Limits should be positive");
        }
    }


    public float getLowerLimit() {
        return lowerLimit;
    }

    public float getUpperLimit() {
        return upperLimit;
    }


    @Override
    public String toString() {
        if (lowerLimit == 0) {
            return "Грузоподъемность: до " + getUpperLimit() + " тонн";
        } else if (upperLimit == 0) {
            return "Грузоподъемность: свыше " + getLowerLimit() + " тонн";
        } else {
            return "Грузоподъемность: от " + getLowerLimit() + " до " + getUpperLimit() + " тонн";
        }
    }
}
