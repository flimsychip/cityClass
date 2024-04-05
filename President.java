package partD;

public class President extends Employee {
    private Student favStudent;

    public President() {
        super();
    }

    public President(String name, String age, int salary, int years, Student student) {
        super(name, age, salary, years);
        this.favStudent = student;
    }

    public Student getFavStudent() {
        return this.favStudent;
    }

    public void setFavStudent(Student student) {
        this.favStudent = student;
    }

    public String toString() {
        return super.toString() + "\nfavorite student " + this.favStudent;
    }
}
