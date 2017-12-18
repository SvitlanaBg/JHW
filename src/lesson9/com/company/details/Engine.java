package lesson9.com.company.details;

public class Engine {
    private int power;
    private String company;

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;

        Engine engine = (Engine) o;

        if (getPower() != engine.getPower()) return false;
        return getCompany() != null ? getCompany().equals(engine.getCompany()) : engine.getCompany() == null;
    }

    @Override
    public int hashCode() {
        int result = getPower();
        result = 31 * result + (getCompany() != null ? getCompany().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company='" + company + '\'' +
                '}';
    }
}
