import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/*
通过反射机制，反编译一个类的属性Field
 */
public class ReflectDemoTest04 {
    public static void main(String[] args) throws Exception{
        //创建这个是为了拼接字符串
        StringBuilder s = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要反编译的类:");
        String s2 = sc.nextLine();
        Class<?> student = Class.forName(s2);
        int modifiers = student.getModifiers();
        s.append(Modifier.toString(modifiers) + " ");
        s.append("class ");
        s.append(student.getSimpleName());


        Field[] fields = student.getDeclaredFields();


        s.append("{\n");
        for(Field f :fields){
            //获取属性
            //获取类型
            Class<?> type = f.getType();
            //获取修饰符
            int i = f.getModifiers();
            String s1 = Modifier.toString(i);

            s.append("\t"+s1 + " ").append(type.getSimpleName() + " ").append(f.getName()).append("\n");
        }
        s.append("}");
        System.out.println(s);
    }
}
