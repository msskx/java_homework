package 第七章习题七.第六题;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description
 * @Author msskx
 * @Date 2021/10/16 13:15
 * @Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        String str="Dream what you want to dream";
        System.out.println(Count(str));
    }
    public static int Count(String sentence){
        String []words=sentence.split(" ");//分割字符串
        return words.length;//返回分割好的数组长度，一般要求格式必须统一
    }
    @Test
    public void Test01() {
        BufferedReader br= null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("F:\\eclipse-workspace\\课堂题目练习\\src\\第七章习题七\\第六题\\english.txt")));
            bw = new BufferedWriter(new FileWriter(new File("F:\\eclipse-workspace\\课堂题目练习\\src\\第七章习题七\\第六题\\englishCount.txt")));

            String data;
            int num=0;
            while((data=br.readLine())!=null){//按行读取
                bw.write(data+(Count(data)));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {////关闭流
            if(bw!=null){

                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null!=br){

                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
