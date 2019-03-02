package com.java.threads.ex02;

public class MyThread implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Licznik: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Wątek został zatrzymany");
                break;
            }
        }
    }
}
