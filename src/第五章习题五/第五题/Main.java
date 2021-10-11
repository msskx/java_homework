package 第五章习题五.第五题;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName Main
 * @Description
 * @Author msskx
 * @Date 2021/10/10 11:53
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        List list=new ArrayList();

        char c='a';
        for (int i = 0; i < 26; i++) {
            char s= (char) (c+i);
            list.add(s);
        }
        Iterator it=list.iterator();
        System.out.println("集合中的元素是");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }


}
