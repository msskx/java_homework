package 第四章习题四.第五题;

/**
 * @ClassName TemporaryEmployee
 * @Description
 * @Author msskx
 * @Date 2021/9/29 14:31
 * @Version 1.0
 **/
public class TemporaryEmployee extends Employee {

    public TemporaryEmployee(String name, long number, double salary, int hireYears) {
        super(name, number, salary);
        this.hireYears = hireYears;
    }

    protected int hireYears;

    public int getHireYears() {
        return hireYears;
    }

    public void setHireYears(int hireYears) {
        this.hireYears = hireYears;
    }

    @Override
    void raiseSalary() {
        this.salary=this.salary*1.5;
    }
}
