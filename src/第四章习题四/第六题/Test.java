package 第四章习题四.第六题;

/**
 * @ClassName Test
 * @Description
 * @Author msskx
 * @Date 2021/9/29 14:49
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        SIM s1=new SIMofChinaMobile();
        SIM s2=new SIMofChinaUnicom();
        s1.setNumber("13239287005");
        s2.setNumber("19891152528");
        MobilePhone m1=new MobilePhone();
        m1.showMess(s1);
        m1.showMess(s2);
    }
}
