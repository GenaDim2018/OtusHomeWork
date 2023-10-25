package ru.otus.homework21;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        double[] arr = new double[100_000_000];
        long time, time1, time2;
        Thread t11 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < arr.length / 2; i++) {
                    arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        };

        Thread t12 = new Thread() {
            public void run() {
                for (int i = arr.length / 2; i < arr.length; i++) {
                    arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        };

        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < arr.length / 4; i++) {
                    arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = arr.length / 4; i < arr.length / 2; i++) {
                    arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        };

        Thread t3 = new Thread() {
            public void run() {
                for (int i = arr.length / 2; i < arr.length * 3 / 4; i++) {
                    arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        };

        Thread t4 = new Thread() {
            public void run() {
                for (int i = arr.length * 3 / 4; i < arr.length; i++) {
                    arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        };

        time1 = System.currentTimeMillis();
        t11.start();
        t12.start();
        t11.join();
        t12.join();
        time2 = System.currentTimeMillis();
        time = time2 - time1;
        System.out.println("Время работы двух потоков: " + time);
        time1 = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        time2 = System.currentTimeMillis();
        time = time2 - time1;
        System.out.println("Время работы четырех потоков: " + time);
    }

}
