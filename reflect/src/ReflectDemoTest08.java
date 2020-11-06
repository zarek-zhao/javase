import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/*
反编译一个类的Constuctor构造方法
 */
public class ReflectDemoTest08 {
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder();

        Class<?> vip = Class.forName("Vip");
        Constructor<?>[] constructors = vip.getConstructors();

        s.append(Modifier.toString(vip.getModifiers()));
        s.append(" class ");
        s.append(vip.getSimpleName());
        s.append("{\n");

        for(Constructor c : constructors){
            s.append("\t");
            s.append(Modifier.toString(c.getModifiers()));
            s.append(" ");
            s.append(vip.getSimpleName());
            s.append("(");
            Class[] parameterTypes = c.getParameterTypes();
            for(Class para : parameterTypes){
                s.append(para.getSimpleName()+",");
            }
            if(parameterTypes.length > 0){
                s.deleteCharAt(s.length()-1);
            }
            s.append("){}\n");

        }
        s.append("}");
        System.out.println(s);

    }
}
