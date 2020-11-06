import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectMethods {
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder();
        Class<?> myClass = Class.forName("java.util.Date");
        s.append(Modifier.toString(myClass.getModifiers()) + " Class " + myClass.getSimpleName() + "{");
        Method[] myClassMethods = myClass.getDeclaredMethods();
        for (Method m : myClassMethods){
            s.append("\t");
            s.append(Modifier.toString(m.getModifiers()));
            s.append(" ");
            s.append(m.getReturnType().getSimpleName() + " ");
            s.append(m.getName());
            s.append("(");
            Class<?>[] parameterTypes = m.getParameterTypes();
            for (Class c : parameterTypes){
                s.append(c.getSimpleName());
                s.append(",");
            }
            s.deleteCharAt(s.length() - 1);
            s.append("){}\n");

        }
        s.append("}");
        System.out.println(s);
    }
}
