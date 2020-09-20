package com.zarek.java.thread;

public class test {
    public static void main(String[] args){
        test test1 = new test();
        System.out.println(test1.diGui(5));
        System.out.println(test1.xunHuan(5));
    }

    public int diGui(int n){
        if(n==1)return n;
        return n*diGui(n - 1);
    }

    public int xunHuan(int n){
        int result = 1;
        while(1 != n){
            result *= n;
            n--;
        }
        return result;
    }
}
