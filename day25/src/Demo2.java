import java.util.Properties;

public class Demo2 {
    public static void main(String[] args) {
        //创建一个Properties对象
        Properties properties = new Properties();

        properties.setProperty("1","ZHAORUIHANG");

        System.out.println(properties.getProperty("1"));

    }
}
