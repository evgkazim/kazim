package ru.kazim.thread;

import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

public class CountDownLatchApp {
    private static int num = 0;
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        IntStream.range(0, 100).forEach((i) -> new Thread(() -> {
            num++;
            countDownLatch.countDown();
        }).start());

        countDownLatch.await();

        System.out.println(num);
    }
}
