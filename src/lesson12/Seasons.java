package lesson12;

public enum Seasons {
    WINTER(-15),
    SPRING(10),
    SUMMER(25) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(15);

    Seasons(int temperature) {
        this.temperature = temperature;
    }

    private final int temperature;

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
