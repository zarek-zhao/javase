import java.util.Scanner;

public class TestUserService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要注册的用户名");
        String username =  sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        User user = new User();
        UserService userService = new UserService();
        try {
            userService.register(username,password,user);
        } catch (MyStringException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("已注册的用户名：" + user.getUsername()  );
        System.out.println("密码：" + user.getPassword());
    }
}
