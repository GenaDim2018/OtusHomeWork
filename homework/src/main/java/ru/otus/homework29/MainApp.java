package ru.otus.homework29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MainApp {
    public static void main(String[] args) {
        Object mon = new Object();
        AtomicInteger counter = new AtomicInteger(3);
        ExecutorService serv = Executors.newFixedThreadPool(3);
        serv.submit(() -> {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (counter.get() != 3)
                            mon.wait();
                        System.out.print("A");
                        counter.set(1);
                        mon.notifyAll();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        serv.submit(() -> {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (counter.get() != 1)
                            mon.wait();
                        System.out.print("B");
                        counter.set(2);
                        mon.notifyAll();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        serv.submit(() -> {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (counter.get() != 2)
                            mon.wait();
                        System.out.print("C");
                        counter.set(3);
                        mon.notifyAll();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
        serv.shutdown();
    }
}
