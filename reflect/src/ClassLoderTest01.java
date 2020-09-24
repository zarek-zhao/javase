import bean.User;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

/*
验证反射机制的灵活性：
    java代码写一遍，在不改变java源代码的基础之上，可以做到不同对象的实例化。
    非常之灵活(符合OCP开闭原则：对扩展开放，对修改关闭。)

    后期学习的是高级框架：
    包括 ：ssh ssm
    Spring SpringMVC MyBatis
    Spring Struts Hibernate
 */
public class ClassLoderTest01 {
    public static void main(String[] args) throws Exception {

        //这种代码写死了，只能创建一个User类型的对象
//        User user = new User();

        //以下代码是灵活的，代码不需要改动，可以修改配置文件，配置文件修改之后，可以创建出不同的实例对象
//        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();
//        System.out.println(path);
//        //创建输入流
//        FileReader fr = new FileReader(path);
//        Properties pro = new Properties();
//        pro.load(fr);
//        fr.close();
//        String className = pro.getProperty("className");
//        System.out.println(className);

        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo.properties");
        Properties pro = new Properties();
        pro.load(in);
        in.close();
        String className = pro.getProperty("className");
        System.out.println(className);

        Class<?> myclass = Class.forName(className);
        Object o = myclass.newInstance();
        System.out.println(o);

    }
}
