package 第五章习题五.第三题;

/**
 * @ClassName MaleDriver
 * @Description
 * @Author msskx
 * @Date 2021/10/10 10:26
 * @Version 1.0
 **/
public class MaleDriver extends Driver {
    public MaleDriver(String name) {
        super(name);
    }

    @Override
    void drives() {
        System.out.println("请输入男司机姓名");
        this.name = input.next();
        System.out.println(this.name + "(male)dirves a vehicle");
    }
}
