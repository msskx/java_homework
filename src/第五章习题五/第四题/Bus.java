package 第五章习题五.第四题;

/**
 * @ClassName Bus
 * @Description
 * @Author msskx
 * @Date 2021/10/10 10:47
 * @Version 1.0
 **/
public class Bus extends MotoVehicles implements MoneyFare{
    @Override
    void brake(String s) {
        System.out.println("公共汽车使用的刹车技术："+s);
    }

    @Override
    public void charge(String c) {
        System.out.println("车票价");
        System.out.println(c+"元一张，不计公里数");
    }
}
