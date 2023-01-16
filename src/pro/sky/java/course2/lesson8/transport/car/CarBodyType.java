package pro.sky.java.course2.lesson8.transport.car;

public enum CarBodyType {

    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    STATION_WAGON("Универсал"),
    SPORT_UTILITY_VEHICLE("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String russianTranslate;


    CarBodyType(String russianTranslate) {
        this.russianTranslate = russianTranslate;
    }

    public String getRussianTranslate() {
        return russianTranslate;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + getRussianTranslate();
    }
}
