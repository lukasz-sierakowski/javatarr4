package com.java.threads.ex05;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Data.counter.addAndGet(1);
            //Data.counter++;
        }
    }
}
