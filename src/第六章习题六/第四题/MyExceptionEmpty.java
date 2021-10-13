package 第六章习题六.第四题;

/**
 * @ClassName MyException
 * @Description
 * @Author msskx
 * @Date 2021/10/13 14:58
 * @Version 1.0
 **/
class MyExceptionEmpty extends Exception{
    public MyExceptionEmpty() {
        super("姓名为空");
    }
}
