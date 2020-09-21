/*
    sleep睡眠太久了，怎么唤醒一个正在睡眠的线程
    注意：这个不是中断线程的执行，是终止的睡眠。
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("t");
        t.start();

        //希望5秒之后了，t线程醒来。(5秒之后主线程手里的活儿干完了。)
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //终断t线程的睡眠(这种终断睡眠的方式依靠了java的异常处理机制。)
        t.interrupt();

    }
}


class MyRunnable2 implements Runnable{

    //重点：run()当中的异常不能throws，只能try catch 。因为子类不能抛出比父类更宽泛的异常。
    //run()方法在父类中没有抛出任何异常，子类不能比父类抛出更多的异常。
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "----> begin");
        //睡眠一年
        try {
            Thread.sleep(1000 * 60 * 60 * 24 * 365);
        } catch (InterruptedException e) {
            //打印异常信息。
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "----> end");
    }

}
