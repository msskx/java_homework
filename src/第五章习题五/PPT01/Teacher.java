package 第五章习题五.PPT01;

/**
 * @ClassName Teacher
 * @Description
 * @Author msskx
 * @Date 2021/10/10 12:36
 * @Version 1.0
 **/
public class Teacher extends Person implements Info {
    String WorkId;
    String apartment;
    double salary;
    double bonus;
    //查询工资
    void getSalary(){
        System.out.println("工资为："+(this.salary+this.bonus));
    }
    //参加会议
    void meeting(){
        System.out.println("老师参加会议");
    }
    //输出个人信息
    void getInfo(){
        System.out.println("姓名：" + this.name + "年龄：" + this.age +
                "性别：" + this.sex + "职工号：" + this.WorkId + "基本工资：" + this.salary +
                "奖金：" + this.bonus + "部门：" + this.apartment);
    }
    @Override
    public void work() {
        System.out.println("老师给学生讲课");
    }

    @Override
    public void m_break() {
        System.out.println("老师回家休息");
    }
}
