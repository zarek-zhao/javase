public class ReflectDemoTest10 {
    public static void main(String[] args) throws Exception{
        //String举例
        Class<?> stringClass = Class.forName("java.lang.String");
        //获取String的父类
        Class<?> superclass = stringClass.getSuperclass();
        System.out.println(superclass.getName());

        //获取String类实现的所有接口
        Class<?>[] interfaces = stringClass.getInterfaces();
        for(Class i : interfaces){
            System.out.println(i.getName());
        }
    }
}
