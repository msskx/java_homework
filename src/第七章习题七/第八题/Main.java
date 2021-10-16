package 第七章习题七.第八题;

import org.junit.Test;

import java.io.*;

/**
 * @ClassName Main
 * @Description 按行读取文件并在每一行后面加上这行的单词个数并写入文件
 * @Author msskx
 * @Date 2021/10/15 18:38
 * @Version 1.0
 **/
//
class TV implements Serializable{

    public static final long serialVersionUID = 41221312L;//必须有序列化标识
    String name;
    int size;

    public TV(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}

public class Main {
    @Test
    public void Test01(){
        ObjectOutputStream oos= null;
        try {
            //序列化对象
            oos = new ObjectOutputStream(new FileOutputStream("F:\\eclipse-workspace\\课堂题目练习\\src\\第七章习题七\\第八题\\object.dat"));
            oos.writeObject(new TV("康佳",50));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            if(oos!=null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
       //反序列化
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("F:\\eclipse-workspace\\课堂题目练习\\src\\第七章习题七\\第八题\\object.dat"));

            Object obj = ois.readObject();
            TV  tv = (TV) obj;
            System.out.println(tv.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
