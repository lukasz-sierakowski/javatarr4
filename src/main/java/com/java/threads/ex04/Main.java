package com.java.threads.ex04;

import com.java.threads.ex01.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.setName("Licznik");
        myThread.start();
        myThread.join();
        System.out.println("Komunikat z metody main");
    }
}
