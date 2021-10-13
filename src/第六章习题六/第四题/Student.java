package 第六章习题六.第四题;

/**
 * @ClassName Student
 * @Description
 * @Author msskx
 * @Date 2021/10/13 14:58
 * @Version 1.0
 **/
public class Student {
    long Id;
    int age;
    String name;

    public Student(long id, int age, String name) throws MyExceptionSmall, MyExceptionBig, MyExceptionEmpty {
        Id = id;
        this.age = age;
        this.name = name;
        if(age<3){
            throw new MyExceptionSmall();
        }
        if(age>35){
            throw new MyExceptionBig();
        }
        if(name.isEmpty()){
            throw new MyExceptionEmpty();
        }
    }
}
