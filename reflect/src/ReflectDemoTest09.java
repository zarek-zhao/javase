import java.lang.reflect.Constructor;

public class ReflectDemoTest09 {
    public static void main(String[] args) throws Exception{
        //不使用反射机制怎么创建对象
        Vip vip = new Vip();

        //使用反射机制创建对象
        Class<?> vipClass = Class.forName("Vip");
        //调用无参数构造方法
        Object obj = vipClass.newInstance();
        Constructor<?> constructor = vipClass.getConstructor(int.class, String.class, String.class, boolean.class);

        Object o = constructor.newInstance(12, "uinbu", "asdf", true);
        System.out.println(o);

    }
}
