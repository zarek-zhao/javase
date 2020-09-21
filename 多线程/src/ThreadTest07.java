public class ThreadTest07 {
    public static void main(String[] args) {
        //创建线程对象
        Thread myThread = new MyThread();
        myThread.setName("t");
        myThread.start();

        try {
            myThread.sleep(1000 * 5);//在执行的时候还是会转换成Thread.sleep(1000 * 5);这行代码的作用是让当前线程进入休眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //5s之后才会执行此处代码
        System.out.println("hello world");
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0;i < 10000;i++){
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
}
