package pre0902;

/**
 *
 *克莱姆法则解方程组
 * 21.8x+2y=28
 * 7x+8y=62
 * 思路分析
 * 前面括号是矩阵上
 * x1=(21.8,28)(7,62)/(21.8,2)(7,8)
 * x2=(28,2)(62,8)/(21.8,2)(7,8)
 */
public class Main {
    public static void main(String[] args) {
        final double FUND=21.8*8+2*7;
        double x=(21.8*62+28*7)/FUND;
        double y=(28*8+2*62)/FUND;
        System.out.println("x="+x+"\n"+"y="+y);


    }
}

