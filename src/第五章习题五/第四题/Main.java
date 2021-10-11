package 第五章习题五.第四题;

import org.junit.Test;

import java.util.Scanner;

/**
 * @ClassName Main
 * @Description
 * @Author msskx
 * @Date 2021/10/10 10:48
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入公交车采用的刹车技术和车票价（元）");
        String s1=input.next();
        String c1=input.next();
        System.out.println("请输入出租车采用的刹车技术、车票价（元）、安装的空调样式");
        String s2=input.next();
        String c2=input.next();
        String t2=input.next();
        bus.brake(s1);
        bus.charge(c1);
        taxi.brake(s2);
        taxi.charge(c2);
        taxi.controlAirTemperature(t2);
    }

}
