package 第四章习题四.第六题;

/**
 * @ClassName MobilePhone
 * @Description
 * @Author msskx
 * @Date 2021/9/29 14:45
 * @Version 1.0
 **/
public class MobilePhone {


    public void showMess(SIM card){
        System.out.println("手机号码：" + card.getNumber() + "\t所属公司:" + card.getCorpName());
    }
}
