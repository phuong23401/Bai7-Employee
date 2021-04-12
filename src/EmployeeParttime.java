public class EmployeeParttime extends Employee {
    double timeWork;

    public EmployeeParttime() {
    }

    public EmployeeParttime(int id, String name, int age, String phoneNum, String email, double timeWork) {
        super(id, name, age, phoneNum, email);
        this.timeWork = timeWork;
    }

    public double getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(double timeWork) {
        this.timeWork = timeWork;
    }

    @Override
    public int payRollSalary() {
        return (int) (timeWork * 100000);
    }
}
