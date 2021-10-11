package 第四章习题四.第五题;

/**
 * @ClassName Manager
 * @Description
 * @Author msskx
 * @Date 2021/9/29 14:26
 * @Version 1.0
 **/
public class Manager extends Employee {
    public Manager(String name, long number, double salary,int officeID) {
        super(name, number, salary);
        this.officeID=officeID;
    }
    protected int officeID;
    protected double bonus;

    public int getOfficeID() {
        return officeID;
    }

    public void setOfficeID(int officeID) {
        this.officeID = officeID;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    void raiseSalary() {
        this.salary=1.1*salary;
    }
}
