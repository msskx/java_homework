package 第七章习题七.第五题;

import java.io.*;

/**
 * @ClassName FileAppend
 * @Description
 * @Author msskx
 * @Date 2021/10/14 17:48
 * @Version 1.0
 **/
public class FileAppend {

    public static void main(String[] args) {
        FileAppendTest();
    }
    public static void FileAppendTest(){
        FileReader fr= null;
        FileWriter fw= null;//追加的方式
        try {
            File file1=new File("F:\\eclipse-workspace\\课堂题目练习\\src\\第七章习题七\\第五题\\a.txt");
            File file2=new File("F:\\eclipse-workspace\\课堂题目练习\\src\\第七章习题七\\第五题\\b.txt");
            //创建流对象
            fr = new FileReader(file1);
            fw = new FileWriter(file2,true);
            //追加文件
            int len;
            char[] cbuf=new char[1024];
            while ((len=fr.read(cbuf))!=-1){
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {//关闭流
            if(fr!=null){

                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fw!=null){

                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
