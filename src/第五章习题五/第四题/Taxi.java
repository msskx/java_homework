package 第五章习题五.第四题;

/**
 * @ClassName Taxi
 * @Description
 * @Author msskx
 * @Date 2021/10/10 10:48
 * @Version 1.0
 **/
public class Taxi extends MotoVehicles implements MoneyFare,ControlTemperature{
    @Override
    void brake(String s) {
        System.out.println("出租车使用的刹车技术"+s);
    }

    @Override
    public void charge(String c) {
        System.out.println("车票价");
        System.out.println(c+"元一张，起步价三公里");
    }

    @Override
    public void controlAirTemperature(String t) {
        System.out.println("出租车安装了" + t + "空调");
    }
}
