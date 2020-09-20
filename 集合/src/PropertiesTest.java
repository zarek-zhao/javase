import java.util.Properties;

//        1.1 每个集合对象的创建
//        1.2 向集合中添加元素
//        1.3 从集合中取出某个元素
//        1.4 遍历集合
public class PropertiesTest {
    public static void main(String[] args) {

        //创建对象
        Properties pro = new Properties();
        //存
        pro.setProperty("username","zhangsan");
        pro.setProperty("password","123");
        //取
        String name = pro.getProperty("username");
        String passwrod= pro.getProperty("password");
        System.out.println("用户名:" + name  +"密码: " + passwrod);
    }
}
