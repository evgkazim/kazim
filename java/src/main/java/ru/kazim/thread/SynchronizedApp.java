package ru.kazim.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.IntStream;

public class SynchronizedApp {
    private static BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(1, true);

    public static void main(String[] args) throws InterruptedException {
        IntStream.range(0, 10).forEach(i -> new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start());

        while (true) {
            Thread.sleep(1000);
            System.out.println(blockingQueue.size());
            System.out.println(blockingQueue.take());
        }
    }

    private static synchronized void sleep() throws InterruptedException {
        System.out.println("Start thread id = " + Thread.currentThread().getId());
        Thread.sleep(1000);
        blockingQueue.put("TEST " + Thread.currentThread().getId());
        System.out.println("End thread id = " + Thread.currentThread().getId());
    }
}
