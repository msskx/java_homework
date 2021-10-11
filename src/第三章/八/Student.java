package 第三章.八;

/**
 * @ClassName Student
 * @Description
 * @Author 和土豆泥
 * @Date 2021/9/15 8:38
 * @Version 1.0
 **/
class Student {
    private static int num;
    private int id;
    private String name;

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Student.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        //随机生成ID
        this.id = (int)(Math.random()*9999+1);
        this.name = name;
        num++;
    }
    //打印ID和name
    public void printIdOrName(){
        System.out.println("ID:"+this.id+"NAME:"+this.name);
    }
}
class Main{
    public static void main(String[] args) {
        Student st1=new Student("马大帅");
        System.out.println("学生ID："+st1.getId());
        System.out.println("此时学生人数为："+ Student.getNum());
        Student st2=new Student("马小帅");
        System.out.println("此时学生人数为："+ Student.getNum());
        System.out.println("学生ID："+st2.getId());
    }
}
