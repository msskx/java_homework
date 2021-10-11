package 第四章习题四.第四题;

import java.sql.SQLOutput;

/**
 * @ClassName Teacher
 * @Description
 * @Author msskx
 * @Date 2021/9/29 14:02
 * @Version 1.0
 **/
public abstract class Teacher {
    public abstract void giveLesson();
}
class MathTeacher extends Teacher{

    @Override
    public void giveLesson() {
        System.out.println("数学老师讲授数学");
    }
}
class JavaTeacher extends Teacher{

    @Override
    public void giveLesson() {
        System.out.println("java老师讲授java");
    }
}
class DeanOffice{
    public void judge(){
        System.out.println("老师进行上课");
    }

}
class Test{
    public static void main(String[] args) {
        new DeanOffice().judge();
        new JavaTeacher().giveLesson();
        new MathTeacher().giveLesson();
    }
}