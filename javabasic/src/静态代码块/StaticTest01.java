package 静态代码块;

public class StaticTest01 {
    static int i = 100;
    static {
        System.out.println("i=" + i);
    }

    public static void main(String[] args) {
        System.out.println("main begain");
        StaticTest01 staticTest01 = new StaticTest01();
    }

    public StaticTest01(){
        System.out.println("空构造方法");
    }

    {

        System.out.println("实例语句块执行");
    }
}
