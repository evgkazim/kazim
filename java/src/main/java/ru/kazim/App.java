package ru.kazim;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arr = {9, 4, 9, 6, 7, 4, 5};
        System.out.println(findFirstUniqueInt(arr));
    }

    // Найти первый не повторяющийся элемент в массиве целых чисел
    public static int findFirstUniqueInt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean is = false;
//            System.out.println("1 " + arr[i]);
            for (int j = 0; j < arr.length; j++) {
//                System.out.println("2 " + arr[j]);
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        is = true;
                    }
                }
            }
            if (!is)
                return arr[i];
        }
        return -1;
    }
}
