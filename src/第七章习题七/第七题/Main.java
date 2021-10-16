package 第七章习题七.第七题;

import java.io.*;
import java.util.*;

/**
 * @ClassName Main
 * @Description
 * @Author msskx
 * @Date 2021/10/14 19:39
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args){
        new DataOperate().write();
        new DataOperate().read();
    }
}
class DataOperate{
    void write() {
        //创建流对象
        DataOutputStream dos= null;
        try {
            dos = new DataOutputStream(new FileOutputStream("F:\\eclipse-workspace\\课堂题目练习\\src\\第七章习题七\\第七题\\tom.dat"));
            //写出文件
            for (int i = 0; i < 11; i++) {
                dos.writeInt(i);
                dos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            if(dos!=null){
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
    void read(){
        DataInputStream dis= null;
        List list= null;
        try {
            //创建流对象
            dis = new DataInputStream(new FileInputStream("F:\\eclipse-workspace\\课堂题目练习\\src\\第七章习题七\\第七题\\tom.dat"));
            //读入文件
//
            list=new ArrayList();
            for (int i = 0; i <11 ; i++) {
                list.add(dis.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(dis!=null){
                //关闭流
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //当我再见你时候，你已牵别人的手，旁边还跟着个小朋友
        //列表转置
        Collections.reverse(list);
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}