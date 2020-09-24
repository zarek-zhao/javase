import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class ReflectDemoTest01 {
    public static void main(String[] args) throws Exception{
        //利用反射机制加载配置文件，第一种方式
        //通过当前线程的类加载器，加载获取配置文件的路径
//        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();
//        //创建文件输入流
//        FileReader reader = new FileReader(path);
//        //创建Properties对象
//        Properties pro = new Properties();
//        //将输入流加载到pro
//        pro.load(reader);
//        //已经将数据加载到pro,可以关闭文件输入流了
//        reader.close();
//
//        //通过key值获取value
//        String className = pro.getProperty("className");
//        System.out.println(className);

        //第二种方式
        //通过当前线程的类加载器对象，加载获取配置文件的文件输入流对象
//        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo.properties");
//        //创建Properties对象
//        Properties pro = new Properties();
//        //加载文件输入流
//        pro.load(resourceAsStream);
//        //可以关闭输入流了
//        resourceAsStream.close();
//        //获取value值
//        System.out.println(pro.getProperty("className"));

        //第三种方式,使用java.util包下的资源绑定类，这种方式最为简单，但是血统正宗，是sun公司直接提供的加载.properties结尾的配置文件的最快速的方式(我已知的，哈哈)
        //使用java.util.ResourceBundle
        ResourceBundle classinfo = ResourceBundle.getBundle("classinfo");
        String className = classinfo.getString("className");
        System.out.println(className);

    }
}
