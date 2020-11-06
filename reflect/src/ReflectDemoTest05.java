import java.lang.reflect.Field;

/*
怎么通过反射机制访问一个java对象的属性：
    给属性赋值set
    获取属性的值get
 */
public class ReflectDemoTest05 {
    public static void main(String[] args) throws Exception {
        //不使用反射机制访问对象的属性
        Student s = new Student();
        //给属性赋值
        s.name = "zhangsan";
        //访问属性的值
        System.out.println(s.name);
        //使用反射机制，怎么去访问一个对象的属性
        Class<?> studentClass = Class.forName("Student");
        Object obj = studentClass.newInstance();//obj就是student对象，底层调用无参数构造方法
        //获取属性依靠名字区分

        Field nameField = studentClass.getDeclaredField("name");

        //给obj对象(student对象)的name赋值
        /*
        虽然使用了反射机制，但是三要素还是缺一不可
            要素一：obj对象
            要素二：name属性
            要素三：lisi 值
          反射机制虽然让代码复杂了，但是代码更加的灵活，可以把这些东西都写道配置文件中，到时候便于代码的修改复用，框架的底层大部分使用了反射机制
         */
        nameField.set(obj, "lisi");
        //读取属性的值
        /*
       读取属性的值也有两个要素
        要素一：obj对象
        要素二：name属性
         */
        System.out.println(nameField.get(obj));


        Field noField = studentClass.getDeclaredField("no");
        Object obj2 = studentClass.newInstance();
        //打破封装（反射机制的缺点:打破封装，可能会给不发分子留下机会），打破封装之后，可以访问类中的私有属性
        //这样设置完之后，在外部也是可以访问private的。
        noField.setAccessible(true);
        noField.set(obj2,1556);
        System.out.println(noField.get(obj));
    }
}
