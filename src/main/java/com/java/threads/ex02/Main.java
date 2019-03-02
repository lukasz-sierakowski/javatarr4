package com.java.threads.ex02;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.setName("Wątek ex2");
        thread.start();
    }
}
