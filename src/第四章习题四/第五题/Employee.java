package 第四章习题四.第五题;

/**
 * @ClassName Employee
 * @Description
 * @Author msskx
 * @Date 2021/9/29 14:16
 * @Version 1.0
 **/
public class Employee {
    protected String name;
    protected long number;
    protected String address;
    protected double salary;

    public Employee(String name, long number, double salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }
    void intr(){
        System.out.println("姓名:" + name +
                "电话:" + number +
                "家庭住址：" + address +
                "薪水" + salary);
    }
    void raiseSalary(){

    }
}
