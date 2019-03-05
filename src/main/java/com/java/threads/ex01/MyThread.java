package com.java.threads.ex01;

/**
 * Przykład utworzenia wątku poprzez dziedziczenie po klasie Thread.
 */
public class MyThread extends Thread {
    /**
     * Metoda, która jest wykonywana, gdy wątek zostanie uruchomiony.
     * Pamiętaj, że ta metoda wykonuje się raz i jak się wykona wątek zostanie zamknięty.
     * W celu wykonywania określonego zadania cały czas musisz o to zadbać np. za pomocą pętli/
     */
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
