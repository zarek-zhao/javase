package com.zarek.java.thread;

/**
 * 采用匿名内部类可以吗？
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        //创建线程对象采用匿名内部类的方式。
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //编写程序，这段程序运行在分支线程中
                for (int i = 0; i < 1000; i++) {
                    System.out.println("分支线程---->" + i);

                }
            }
        });
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程---->" + i);
 
        }
    }
}
