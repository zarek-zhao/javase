import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
可变长度参数
    int... args 这就是可变长度参数
    语法是：类型... (注意：一定是三个点)
    1. 可变长度参数要求的参数个数是：0~N个
    2. 可变长度参数在参数列表中必须在最后一个位置上，而且可变长度参数只能有一个

    可以当可变长度参数当作一个数组看待，但不是一个数组
 */
public class ReflectDemoTest06 {
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder();
        Class<?> myMethodsClass = Class.forName("MyMethods");
        Method[] methods = myMethodsClass.getDeclaredMethods();
        for(Method m : methods){
            s.append(Modifier.toString(m.getModifiers()) + " " +m.getReturnType() + " " + m.getName() + "\n");
        }

        System.out.println(s);

    }

//    public static void m(int i,String... arss){
//        System.out.println("方法执行了");
//    }
}
