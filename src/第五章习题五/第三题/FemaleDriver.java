package 第五章习题五.第三题;

/**
 * @ClassName FemaleDriver
 * @Description
 * @Author msskx
 * @Date 2021/10/10 10:25
 * @Version 1.0
 **/
public class FemaleDriver extends Driver {
    public FemaleDriver(String name) {
        super(name);
    }

    @Override
    void drives() {
        System.out.println("请输入女司机姓名");
        this.name = input.next();
        System.out.println(this.name + "(female)dirves a vehicle");
    }
}
