package partD;

public class Employee extends Person {
    private int salary;
    private int yearsWorked;

    public Employee() {
        super();
    }

    public Employee(String name, String age, int salary, int years) {
        super(name, age);
        this.salary = salary;
        this.yearsWorked = years;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getYearsWorked() {
        return this.yearsWorked;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setYearsWorked(int num) {
        this.yearsWorked = num;
    }

    public String toString() {
        return super.toString() + " | salary: " + this.salary + " | years worked: " + this.yearsWorked;
    }
}
