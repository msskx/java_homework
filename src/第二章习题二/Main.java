package 第二章习题二;

import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

/**
 * @ClassName Main
 * @Description
 * @Author msskx
 * @Date 2021/9/9 21:36
 * @Version 1.0
 **/
public class Main {
    /*
     * @Author Msskx
     * @Description 第一题计算三角形面积
     * @Date 2021/9/9 21:36
     * @Param
     * @return
     */
//    public static void main(String[] args) {
//        //扫描器接受三角形的边长
//        Scanner input=new Scanner(System.in);
//        System.out.println("请输入边长a：");
//        double a=input.nextDouble();
//        System.out.println("请输入边长b：");
//        double b=input.nextDouble();
//        System.out.println("请输入边长c：");
//        double c=input.nextDouble();
//        double p=(a+b+c)/2;
//        double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
//        System.out.println("三角形的面积是："+area);
//    }
    /*
     * @Author Msskx
     * @Description 第二题求素数
     * @Date 2021/9/9 21:45
     * @Param
     * @return
     */
//    public static boolean isPrime(int num){
//        for(int j=2;j*j<=num;j++) {
//            if(num % j == 0 ){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        System.out.println("50到100内的素数有：");
//        for(int i=50;i<=100;i++){
//            if(isPrime(i)){
//                System.out.print(i+"  ");
//            }
//        }
//    }
    /*
     * @Author Msskx
     * @Description 第三题杨辉三角
     * @Date 2021/9/10 11:45
     * @Param
     * @return
     */
    public static void main(String[] args) {
        final int MAX = 10;
        // 分配三角形数组
        int[][] array = new int[MAX + 1][MAX + 1];
        // 填充三角形数组
        for (int n = 0; n < array.length; n++)
            for (int k = 0; k < array[n].length; k++)
            {
                //计算二项式系数 n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
                int temp = 1;
                for (int i = 1; i <= k; i++)
                    temp = temp * (n - i + 1) / i;
                array[n][k] = temp;
            }
        // 打印三角形的数组
        for(int i=0;i<array[0].length;i++){
            for(int j=0;j<i;j++){
                System.out.print("\t"+ array[i][j]);
            }
            System.out.println();
        }
    }
    /*
     * @Author Msskx
     * @Description 第四题随机整数求最小数
     * @Date 2021/9/10 15:05
     * @Param
     * @return
     */
//    public static void main(String[] args) {
//        //首先把数组new出来
//        int []array=new int[10];
//        //给数组里面每个元素赋值
//        for(int i =0;i<array.length;i++){
//            array[i]= (int) (Math.random()*9+1);
//        }
//        //遍历数组
//        for(int num:array){
//            System.out.print(num+" ");
//        }
//        //进行排序
//        for(int i=0;i<array.length-1;i++){
//            for(int j=0;j<array.length-i-1;j++){
//                if(array[j]>array[j+1]){
//                    int temp=array[j];
//                    array[j]=array[j+1];
//                    array[j+1]=temp;
//                }
//            }
//        }
//        System.out.println();
//        //再次遍历，验证结果
//        for(int num:array){
//            System.out.print(num+" ");
//        }
//    }
    /*
     * @Author Msskx
     * @Description 第五题选择排序
     * @Date 2021/9/10 18:40
     * @Param
     * @return
     */
//    public static void main(String[] args) {
//        //首先new一个数组将数字存储起来
//        int []num=new int[]{2,8,4,3,7,1,5};
//        for(int n:num){
//            System.out.print(n+"  ");
//        }
//        System.out.println();
//        //利用选择排序进行从小到大排序
//        for(int i=0;i<num.length;i++){
//            for(int j=i+1;j<num.length;j++){
//                if(num[i]>num[j]){
//                    int temp=num[i];
//                    num[i]=num[j];
//                    num[j]=temp;
//                }
//            }
//        }
//        for(int n:num){
//            System.out.print(n+"  ");
//        }
//    }
}
