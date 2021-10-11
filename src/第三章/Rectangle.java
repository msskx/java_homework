package 第三章;

/**
 * @ClassName Rectangle
 * @Description
 * @Author msskx
 * @Date 2021/9/15 9:51
 * @Version 1.0
 **/
class Rectangle {
    private double width=1;
    private double height=1;
    private static String color="white";
    public Rectangle(){

    }
    public Rectangle(double width, double height,String color) {
        this.width = width;
        this.height = height;
        Rectangle.color =color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Rectangle.color = color;
    }
    public double computeArea(){
        return this.height*this.width;
    }
    public double CirCumference(){
        return 2*(this.height+this.width);
    }
}
class Main{
    public static void main(String[]args){
        Rectangle r1=new Rectangle(3,6,"红色");
        System.out.println("这是一个："+"长为："+r1.getHeight()+"宽为"+r1.getWidth()+
                "面积为"+r1.computeArea()+"周长为"+r1.CirCumference()+"颜色为"+r1.getColor()+"的矩形");
        Rectangle r2=new Rectangle(9,6,"黄色");
        System.out.println("这是一个："+"长为："+r2.getHeight()+"宽为"+r2.getWidth()+
                "面积为"+r2.computeArea()+"周长为"+r2.CirCumference()+"颜色为"+r2.getColor()+"的矩形");


        System.out.println("这是一个："+"长为："+r1.getHeight()+"宽为"+r1.getWidth()+
                "面积为"+r1.computeArea()+"周长为"+r1.CirCumference()+"颜色为"+r1.getColor()+"的矩形");


    }
}