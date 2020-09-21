public class MultiTheradingTest02 {
    public static void main(String[] args) {
        //创建一个可运行的对象
//        ThreadThree threadThree = new ThreadThree();
//        //将可运行的对象封装成一个线程对象
//        Thread thread = new Thread(threadThree);
        Thread thread = new Thread(new ThreadThree());
        //启动线程
        thread.start();
        while(true){
            System.out.println("被撒地方");
        }
    }
}

//这并不是一个线程类，是一个可运行的类。它还不是一个线程。
class ThreadThree implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("笨比杨杰");
        }
    }
}
