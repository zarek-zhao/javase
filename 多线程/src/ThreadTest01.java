/*
1. 怎么获取当前线程对象？
2. 获取线程对象的名字
3. 修改线程对象的名字
 */
public class ThreadTest01 {
    public static void main(String[] args) {

        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());
        //创建线程对象

        MyThread2 t = new MyThread2();
        //设置线程的名字
        t.setName("tttt");
        //获取线程的名字
        String name = t.getName();
        System.out.println(name );
        //启动线程
        t.start();

    }

}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread currentThread = Thread.currentThread();

            System.out.println(currentThread.getName()+"分支线程---->" + i);
        }
    }
}