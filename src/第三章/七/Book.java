package 第三章.七;

/**
 * @ClassName Book
 * @Description
 * @Author msskx
 * @Date 2021/9/15 8:55
 * @Version 1.0
 **/
public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private double price;
    private String publish;
    public  int num;

    public Book(int bookId, String bookName, String author, double price, String publish) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.publish = publish;

    }

    public void borrowBook(){
        System.out.println("借书成功");
        num++;
    }
    public void returnBook(){
        System.out.println("还书成功");
    }
}
class Main{
    public static void main(String[] args) {
        Book b1=new Book(10001,"圣经","God",9.9,"懂王书社");
        b1.borrowBook();
        b1.borrowBook();
        System.out.println("b1书被借的次数"+ b1.num);
        Book b2=new Book(10001,"小圣经","God",9.9,"懂王书社");
        b2.borrowBook();
        b2.borrowBook();
        b2.borrowBook();
        b2.borrowBook();
        System.out.println("b2书被借的次数"+ b2.num);
    }
}
