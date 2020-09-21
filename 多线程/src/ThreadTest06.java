/*
关于线程的sleep方法：
    static void sleep(long mills)
    1. 静态方法
    2. 参数是毫秒
    3. 作用：让当前线程进入休眠，进入“阻塞状态”放弃占有CPU时间片，让给其它线程使用。
        这行代码出现在A线程中，A线程就会进入休眠
    4. Thread.sleep()方法，可以做到这种效果
        间隔特定的时间，去执行一段特点的代码，每隔多久执行一次。
 */

public class ThreadTest06 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello world    ");
    }
}
