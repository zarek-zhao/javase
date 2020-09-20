package com.zarek.java.thread;

/**
 * 大家分析一下程序有几个线程？
 * 除垃圾回收线程之外，有几个线程？
 * 只有一个主线程，没有启动分支线程，所以着只有一个主线程。
 * main begin
 * m1 begin
 * m2 begin
 * m3 execute
 * m2 over
 * m1 over
 *
 * 一个栈中，自上而下的顺序逐行执行。
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        System.out.println("main begin");
        m1();
    }

    private static void m1() {







        System.out.println("m1 over");

    }

    private static void m2() {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");

    }

    private static void m3() {
        System.out.println("m3 execute");
    }
}
