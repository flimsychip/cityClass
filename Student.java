package partD;

public class Student extends Person {
    private Major major;

    public Student() {
        super();
    }

    public Student(String name, String age, Major major) {
        super(name, age);
        this.major = major;
    }

    public Major getMajor() {
        return this.major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public String toString() {
        return super.toString() + " | major: " + this.major;
    }
}