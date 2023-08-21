package ru.kazim.thread;

import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class SemaphoreApp {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(10);
        IntStream.range(0, 100).forEach(i -> new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    semaphore.acquire();
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getId() + " finish!");
                    semaphore.release();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }).start());

        System.out.println("End!");
    }
}
