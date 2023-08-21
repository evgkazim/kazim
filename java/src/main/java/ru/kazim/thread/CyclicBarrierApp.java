package ru.kazim.thread;

import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class CyclicBarrierApp {
    public static void main(String[] args) {
        final CyclicBarrier b1 = new CyclicBarrier(10);
        final CyclicBarrier b2 = new CyclicBarrier(10);
        IntStream.range(0, 10).forEach((i) -> new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("оторвать");
                    b1.await();
                    System.out.println("намазать");
                    b2.await();
                    System.out.println("приклеить");
                } catch (Exception ignored) {}
            }
        }).start());
    }
}
