package 第五章习题五.第三题;

import org.junit.Test;

import java.util.Scanner;

/**
 * @ClassName Driver
 * @Description
 * @Author msskx
 * @Date 2021/10/10 10:23
 * @Version 1.0
 **/
public abstract class Driver {
    String name;

    abstract void drives();

    Scanner input=new Scanner(System.in);

    public Driver(String name) {
        this.name = name;
    }
}
class Main{
    public static void main(String[] args) {

        FemaleDriver nv=new FemaleDriver("Mary");
        MaleDriver nan=new MaleDriver("Tom");

        nv.drives();
        nan.drives();
    }

}
