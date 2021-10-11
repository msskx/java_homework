package 第四章习题四.第三题;

/**
 * @ClassName Animal
 * @Description
 * @Author msskx
 * @Date 2021/9/29 13:55
 * @Version 1.0
 **/
public abstract class Animal {
    public abstract void sound();
}

class Cat extends Animal{

    @Override
    public void sound() {
        System.out.println("小猫喵喵");
    }
}
class Bird extends Animal {

    @Override
    public void sound() {
        System.out.println("小鸟啾啾");
    }
}
class Test{
    public static void main(String[] args) {
        new Cat().sound();
        new Bird().sound();
    }

}
