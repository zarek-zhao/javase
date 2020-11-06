import bean.User;

import java.lang.reflect.Method;

/*
*****
重点：通过反射机制怎么去调用一个对象的方法？
*   反射机制，让代码很具有通用性，可变化的内容都是写到配置文件当中，
*   将来修改配置文件之后，创建的对象不一样了，调用的方法也不同了，但是java代码不需要做任何改动，这就是反射机制的魅力。
 */
public class ReflectDemoTest07 {
    public static void main(String[] args) throws Exception{
        //不适用反射机制，调用对象的方法
        User user = new User();
        user.setAge(12);

        //使用反射机制调用对象的方法
        Class<?> studentClass = Class.forName("Student");
        Object obj = studentClass.newInstance();
        Method add = studentClass.getMethod("add",int.class,int.class);
        //调用方法四要素；
        //loginMethod方法
        /*
        obj对象
        实参
        返回值
         */
        add.invoke(obj,12,16);


    }
}
