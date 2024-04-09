package ru.kazim.thread;

import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class SemaphoreApp {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        IntStream.range(0, 100).forEach(i -> new Thread(() -> {
            try {
                semaphore.acquire();
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getId() + " finish!");
                semaphore.release();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).start());

        System.out.println("End!");
    }
}
