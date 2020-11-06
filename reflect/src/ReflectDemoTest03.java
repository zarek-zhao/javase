import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
反射属性Field
 */
public class ReflectDemoTest03 {
    public static void main(String[] args) throws Exception{
        //Field翻译为字段，其实就是属性/成员
        //反射Student类中的所有Field
        Class studentClass = Class.forName("Student");
        //获取类中所有的public修饰的Field
        Field[] fields = studentClass.getFields();
        System.out.println(fields[0].getName());
        //获取所有的Field
        Field[] declaredFields = studentClass.getDeclaredFields();
        System.out.println(declaredFields.length);

        for(Field f :declaredFields){
            System.out.println(f.getName());
            Class<?> fileType = f.getType();
            String name = fileType.getSimpleName();
            System.out.println(name);
            //获取属性的修饰符列表
            int i = f.getModifiers();//返回的修饰符是一个数字，每个数字是该修饰符的代号
            String s = Modifier.toString(i);
            System.out.println(s);
        }

    }
}
