package 第五章习题五.PPT01;

import java.util.Scanner;

/**
 * @ClassName Person
 * @Description
 * @Author msskx
 * @Date 2021/10/10 12:36
 * @Version 1.0
 **/
public class Person {
    String name;
    String sex;
    int age;
    Scanner input=new Scanner(System.in);
    void setInfo(){
        System.out.println("请输入姓名、性别、年龄");
        name=input.next();
        sex=input.next();
        age=input.nextInt();
    }


}
