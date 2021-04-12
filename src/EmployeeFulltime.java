public class EmployeeFulltime extends Employee{
    int prizeMoney;
    int forfeitMoney;
    int basicSalary;

    public EmployeeFulltime() {
    }

    public EmployeeFulltime(int id, String name, int age, String phoneNum, String email, int prizeMoney, int forfeitMoney, int basicSalary) {
        super(id, name, age, phoneNum, email);
        this.prizeMoney = prizeMoney;
        this.forfeitMoney = forfeitMoney;
        this.basicSalary = basicSalary;
    }

    public int getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(int prizeMoney) {
        this.prizeMoney = prizeMoney;
    }

    public int getForfeitMoney() {
        return forfeitMoney;
    }

    public void setForfeitMoney(int forfeitMoney) {
        this.forfeitMoney = forfeitMoney;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public int payRollSalary() {
        return basicSalary + prizeMoney - forfeitMoney;
    }
}
