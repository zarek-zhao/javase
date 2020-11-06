import java.util.ResourceBundle;

/*
什么是反射机制？反射机制有什么用？
    通过反射机制，可以完成对字节码文件的访问，可以操作字节码文件
    作用：可以让程序更加灵活

        java.lang.reflect.*;

        java.lang.Class
        java.lang.reflect.Method
        java.lang.reflet.Constructor;
        java.lang.reflet.Field

        在java中获取Class的三种方式
        Class  c = Class.forName("完整类名");

        Class c = 对象.getClass();

        Class c = int.class;
        Class c = String.class;

        获取了Class之后，可以调用无参数的构造方法来实例化对象
        Class c = Class.forName("java.util.Date");
        Object obj = c.newInstance();

        一定要注意：
            newInstance()底层调用的是该类型的无参数构造方法。
            如果没有这个无参数构造方法会出现“实例化”异常

        如果你只想让一个类的"静态代码块"执行的话，你可以怎么做？
        Class.forName("该类的类名")
        这样类就加载了，类加载的时候，静态代码块执行！！！

 */
public class ReflectDemoTest02 {
    public static void main(String[] args) {
        //通过反射机制创建对象
        //使用资源绑定器获取配置文件的数据
        ResourceBundle classinfo = ResourceBundle.getBundle("classinfo");
        String className = classinfo.getString("className");
        try {
            //使用类类加载类
            Class<?> aClass = Class.forName(className);
            //使用newInstance方法创建类的实例化对象
            Object o = aClass.newInstance();

            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
