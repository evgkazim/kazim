package ru.kazim.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

    public static void main(String[] args) {
        //SpringApplication.run(AppApplication.class, args);

        int[] a = new int[]{1, 2, 4, 5};
        int[] b = new int[]{3, 3, 4};
        int[] c = new int[]{2, 3, 4, 5, 6};

        System.out.println(find(a, b, c));
    }

    static int find(int[] a, int[] b, int[] c) {
        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    for (int k : c) {
                        if (j == k) {
                            return i;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
