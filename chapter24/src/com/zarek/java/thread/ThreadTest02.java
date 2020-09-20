package com.zarek.java.thread;

/**
 * 实现多线程的第一个方式
 * 编写一个类直接继承于java.lang.Thread，重写run方法
 *
 * 怎么创建一个线程对象？new就行了
 * 怎么启动一个线程？调用线程对象的start()方法
 *
 * 注意：
 *  亘古不变的道理：
 *      方法体当中的代码永远都是自上而下顺序依次逐行执行的。
 *  首先先将main方法压栈，然后当main方法调用方法的时候会往主线程压栈，创建调用方法的栈帧，那么什么是栈帧？
 *      每个方法再虚拟机栈被执行的时候，都会同步创建一个栈帧，用于存储局部变量表，操作数栈，动态链接，方法出口等信息。每个方法被调用直至执行完毕的过程，就对应着一个栈帧在虚拟机中从入栈到出栈的过程。
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        //这里是main方法，这里的代码属于主线程，在主栈中运行
        //新建一个分支线程对象
        MyThread myThread = new MyThread();

        //启动线程
        //start()方法的作用是：启动一个新的分支线程，在JVM中开辟一个新的栈空间，这段代码任务完成之后瞬间就结束了。这段代码的任务只是为了开辟一个新的栈空间
        //只要新的栈空间开出来，start()方法就结束了。线程就启动成功了
        //启动成功的线程会自动调用run方法，并且run方法在分支栈的栈底部（压栈）
        //run方法在分支栈的栈底部，main方法在主栈的栈底部。run和main是平级的。
        myThread.start();

        //这里的代码还是运行在主线程中
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程----->"+ i );

        }
    }
}

//定义线程类
class MyThread extends  Thread{
    @Override
    public void run() {
        //编写程序，这段程序运行在分支线程中
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程---->" + i);
            
        }
    }
}
