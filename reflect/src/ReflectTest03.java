import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/*
验证反射机制的灵活性；
    java代码写一遍，再不改变java源代码的基础之上，可以做到不同对象的实例化。
    非常之灵活(符合OCP开闭原则，对扩展开放，对修改关闭)
 */

public class ReflectTest03 {
    public static void main(String[] args) {
        //通过IO流读取classinfo.properties文件
        FileReader fr = null;
        try {
            fr = new FileReader("反射/classinfo.properties");
            //创建属性类对象Map
            Properties pro = new Properties();
            //加载
            pro.load(fr);
            //通过key获取value
            String className = pro.getProperty("className");
            System.out.println(className);
            //通过反射机制实例化对象
            Class<?> aClass = Class.forName(className);
            Object obj = aClass.newInstance();
            System.out.println(obj );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
