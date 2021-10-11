package 第五章习题五.PPT01;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

/**
 * @ClassName Student
 * @Description
 * @Author msskx
 * @Date 2021/10/10 12:36
 * @Version 1.0
 **/
public class Student extends Person implements Info{
    String Id;
    String major;
    String m_class;
    int highMath;
    int English;
    //查询总分
    int  FindScore(){
        return this.English+this.highMath;
    }
    //参加运动会
    void sport(){
        System.out.println("参加运动会");
    }
    //打印所有信息
    public void toInfo() {
        System.out.println("姓名：" + this.name + "年龄：" + this.age +
                "性别：" + this.sex + "专业：" + this.major + "班级："
                + this.m_class + "学号：" + this.Id + "高数成绩：" +
                this.highMath + "英语成绩：" + this.English);
    }

    @Override
    public void work() {
        System.out.println("学生听老师讲课");
    }

    @Override
    public void m_break() {
        System.out.println("学生在宿舍休息");
    }
}
