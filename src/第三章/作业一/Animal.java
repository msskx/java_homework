package 第三章.作业一;

/**
 * @ClassName Animal
 * @Description
 * @Author msskx
 * @Date 2021/9/17 11:07
 * @Version 1.0
 **/
class Animal {
    private String kind;
    private String name;
    private int age;
    private String color;
    private double weight;
    public void eat(String address){
        System.out.println("在"+address+"休息");
    }
    public void breakTime(String time){
        System.out.println("在"+time+"休息");
    }
    public void play(String address){
        System.out.println("在"+address+"玩耍");
    }
    public void printInfo(){
        System.out.println(
                "品类："+this.kind+
                "昵称："+this.name+
                "年龄"+this.age+
                "体重："+this.weight);
    }

    public Animal() {
    }

    public Animal(String kind, String name, int age, String color, double weight) {
        this.kind = kind;
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
class Main{
    public static void main(String[] args) {
        Animal dog=new Animal("狗","黑背",3,"黑",20);
        dog.printInfo();
    }
}