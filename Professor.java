package partD;

public class Professor extends Employee {
    private double rmp;

    public Professor() {
        super();
    }

    public Professor(String name, String age, int salary, int years, double rmp) {
        super(name, age, salary, years);
        this.rmp = rmp;
    }

    public double getRmp() {
        return this.rmp;
    }

    public void setRmp(double rmp) {
        this.rmp = rmp;
    }

    public String toString() {
        return super.toString() + " | ratemyprofessor rating: " + this.rmp;
    }
}
