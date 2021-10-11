package 第五章习题五.第六题;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName Main
 * @Description
 * @Author msskx
 * @Date 2021/10/10 12:09
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add('U');
        set.add('a');
        set.add('c');
        set.add('a');
        set.add('u');
        Iterator it =set.iterator();
        System.out.println("Set中的元素有");
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }
}
