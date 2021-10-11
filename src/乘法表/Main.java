package 乘法表;

/**
 * @ClassName Main
 * @Description
 * @Author msskx
 * @Date 2021/9/9 11:04
 * @Version 1.0
 **/
public class Main {
    /*
     * @Author Msskx
     * @Description 正常输出版本
     * @Date
     * @Param
     * @return
     **/
//    public static void main(String[] args) {
//        for(int i=1;i<=9;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(i+"*"+j+"="+i*j+"  ");
//            }
//            System.out.println();
//        }
//    }
    /*
     * @Author Msskx
     * @Description 老师要求阴间版
     * @Date
     * @Param
     * @return
     **/

    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=9;j>=i;j--){
                System.out.print(i+"*"+j+"="+i*j+"  ");
            }
            System.out.println();
        }
    }

}
