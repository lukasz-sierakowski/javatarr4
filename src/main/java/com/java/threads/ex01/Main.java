package com.java.threads.ex01;

/**
 * Przykład utworzenia i uruchomienia pojedyńczego wątku.
 */
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        // Nadajemy nazwę wątkowi, która będzie widoczna pod debuggerem
        myThread.setName("Licznik");
        // Uruchamiamy wątek
        myThread.start();
        System.out.println("Komunikat z metody main");
    }
}
