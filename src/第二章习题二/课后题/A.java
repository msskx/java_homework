package 第二章习题二.课后题;

public class A {
    //第三题B正确
//    public static void main(String[] args) {
//        int x=3,y=5,k=0;
//        switch (x%y+3){
//            case 0: k=x*y;break;
//            case 6: k=x/y;break;
//            case 12:k=x-y;break;
//            default:k=x*y-x;break;
//        }
//        System.out.println(k);
//    }
    //第四题C正确
//    public static void main(String[] args) {
//        int a=3;
//        int b=4;
//        int x=5;
//        if(a*a+b*b==x*x)
//            x=x<<(b-a);
//        System.out.println(x);
//    }

    //第五题A正确
//    public static void main(String[] args) {
//        int j=0;
//        for(int i=3;i>=0;i--){
//            j+=i;
//            System.out.print(j);
//        }
//    }
    //第六题C正确
//    public static void main(String[] args) {
//        int j=9,i=6;
//        while(--i!=3){
//            j+=2;
//        }
//        System.out.println(j);
//    }
    //第七题D正确
    public static void main(String[] args) {
        int j=0;
        for(int i=5;i>0&j<10;i--){
            j+=i;
        }
        System.out.println(j);

    }
}
