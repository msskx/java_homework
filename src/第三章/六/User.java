package 第三章.六;

/**
 * @ClassName User
 * @Description
 * @Author msskx
 * @Date 2021/9/15 9:46
 * @Version 1.0
 **/
public class User {
    private String account;
    private String password;

    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
class Main{
    public static void main(String[] args) {
        User u1=new User("majiaozhu","123456");
        System.out.println("账户"+u1.getAccount()+"密码"+u1.getPassword());
    }
}