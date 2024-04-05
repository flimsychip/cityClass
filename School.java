package partD;

public class School extends Building {
    private int numStudents;
    private President president;

    public School() {
        super();
    }

    public School(String name, String neighborhood, int numStudents, President pres) {
        super(name, neighborhood);
        this.numStudents = numStudents;
        this.president = pres;
    }

    public int getNumStudents() {
        return this.numStudents;
    }

    public President getPresident() {
        return this.president;
    }

    public void setNumStudents(int num) {
        this.numStudents = num;
    }

    public void setPresident(President pres) {
        this.president = pres;
    }

    public String toString() {
        return super.toString() + "\nthis building is a school. number of students: " + this.numStudents + "\npresident " + this.president;
    }
}
