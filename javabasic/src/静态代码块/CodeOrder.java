package 静态代码块;

//判断以下程序的执行顺序

public class CodeOrder {
    static{
        System.out.println("A");
    }

    public static void main(String[] args){
        System.out.println("main begin");
        new CodeOrder();
        System.out.println("main over");
    }

    public CodeOrder(){
        System.out.println("B");
    }

    {
        System.out.println("C");
    }

    static{
        System.out.println("X");
    }
}

/**
 * A
 * X
 * mainbegin
 * C
 * B
 * mainover
 */












