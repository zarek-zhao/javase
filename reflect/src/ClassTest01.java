import java.util.Date;

public class ClassTest01 {
    public static void main(String[] args) {
        /*
        Class.forName()
            1.静态方法
            2.方法的参数是一个字符串
            3.字符串需要的是一个完整类名
            4.完整类名必须带有报名。java.lang包也不例外
         */
        Class c1 = null;
        Class c3 = null;
        try {
            c1 = Class.forName("java.lang.String");  //String类的字节码文件，或者说c1代表String的类型
            Class c2 = Class.forName("java.lang.Integer"); //Integer类的字节码文件
             c3 = Class.forName("java.util.Date");    //Date类的字节码文件
            Class c4 = Class.forName("java.lang.System");  //System类的字节码文件
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //java中任何一个对象都有一个方法：getClass()
        String s = "abc";
        Class x = s.getClass();//x代表String.class字节码文件，x代表String类型
        System.out.println(c1 == x);
        Date m = new Date();
        System.out.println(m);
        Class y = m.getClass();
        System.out.println(c3 == y);
    }
}
