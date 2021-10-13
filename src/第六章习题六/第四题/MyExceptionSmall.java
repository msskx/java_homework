package 第六章习题六.第四题;

/**
 * @ClassName MyExceptionSmall
 * @Description
 * @Author msskx
 * @Date 2021/10/13 15:06
 * @Version 1.0
 **/
public class MyExceptionSmall extends Exception{
    public MyExceptionSmall() {
        super("年龄小于3");
    }
}
