package 第三章.九;

import java.util.Scanner;

/**
 * @ClassName Caller
 * @Description
 * @Author msskx
 * @Date 2021/9/14 21:39
 * @Version 1.0
 **/
class Main{
    public static void main(String[] args) {
        Caller c1=new Caller();
        c1.buyCaller();
        c1.callMedical();
    }
}
public class Caller {
    private String number;
    private String name;
    private String address;
    Scanner input=new Scanner(System.in);
    //构造器
    public Caller() {
    }
    //购买
    public void buyCaller(){
        System.out.println("请输入呼叫器号码：");
        this.number=input.nextLine();
        System.out.println("请输入用户姓名：");
        this.name=input.nextLine();
        System.out.println("请输入用户地址：");
        this.address=input.nextLine();
    }
    //Security, medical station, restaurant
    //三个呼叫按钮
    public void callSecurity(){
        System.out.println("号码"+this.number+"姓名"+this.name+"地址"+this.address);
        System.out.println("请求呼叫保安！！");
    }
    public void callMedical(){
        System.out.println("号码"+this.number+"姓名"+this.name+"地址"+this.address);
        System.out.println("请求呼叫保安！！");
    }
    public void callRestaurant(){
        System.out.println("号码"+this.number+"姓名"+this.name+"地址"+this.address);
        System.out.println("请求呼叫保安！！");
    }
}
