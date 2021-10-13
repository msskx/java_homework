package 第六章习题六.第三题;

import java.util.Scanner;

/**
 * @ClassName Triangle
 * @Description
 * @Author msskx
 * @Date 2021/10/13 14:41
 * @Version 1.0
 **/
public class Triangle {

    void sanjiao(int a,int b,int c) throws IllegalArgumentException {
        if((a+b)>c&&(a+c>b)&&(b+c)>a){
            System.out.println("可以构成三角形");
            System.out.println("三角形的三边长分别为" + "a=" + a +" "+ "b=" + b +" "+ "c=" + c);
        }else{
            throw new IllegalArgumentException("a,b,c,不能构成三角形");
        }
    }
}
class Main{
    public static void main(String[] args) throws IllegalArgumentException {
        System.out.println("请输入三条边");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        new Triangle().sanjiao(a,b,c);
    }
}