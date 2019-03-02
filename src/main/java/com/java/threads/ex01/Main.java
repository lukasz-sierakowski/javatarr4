package com.java.threads.ex01;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("Licznik");
        myThread.start();
        System.out.println("Komunikat z metody main");
    }
}
