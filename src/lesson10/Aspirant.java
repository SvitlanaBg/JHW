package lesson10;

public class Aspirant extends Student {
    private String work;

    public Aspirant() {
    }

    public Aspirant(String work) {
        this.work = work;
    }

    public Aspirant(String firstName, String lastName, String group, String work) {
        super(firstName, lastName, group);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aspirant)) return false;
        if (!super.equals(o)) return false;

        Aspirant aspirant = (Aspirant) o;

        return getWork() != null ? getWork().equals(aspirant.getWork()) : aspirant.getWork() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getWork() != null ? getWork().hashCode() : 0);
        return result;
    }

    public void getScholarship() {
        System.out.println("250");
    }
}
