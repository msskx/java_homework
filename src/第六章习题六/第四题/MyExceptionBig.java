package 第六章习题六.第四题;

/**
 * @ClassName MyExceptionBig
 * @Description
 * @Author msskx
 * @Date 2021/10/13 15:06
 * @Version 1.0
 **/
public class MyExceptionBig extends Exception {
    public MyExceptionBig() {
        super("年龄大于35");
    }
}
