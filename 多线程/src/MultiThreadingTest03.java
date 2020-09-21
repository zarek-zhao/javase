public class MultiThreadingTest03 {
    public static void main(String[] args) {
        //创建线程对象，采用匿名内部类（一个没有名字的类实现了Runnable接口）方式，接口不能new对象，但是可以new一个没有名字的类实现接口的对象。
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println("分支栈");
                }
            }
        });

        t.start();

        while(true){
            System.out.println("主栈");
        }

    }
}
