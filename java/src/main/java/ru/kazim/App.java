package ru.kazim;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");

        System.out.println(list);

        Stack<String> stack = new Stack<>();
        stack.add("1");
        stack.add("2");
        stack.add("3");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.peek();
        System.out.println(stack);
        stack.push("4");
        System.out.println(stack);
        stack.add("5");
        System.out.println(stack);

        Queue<String> queue = new ArrayDeque<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.peek();
        System.out.println(queue);


//        int[] arr = {9, 4, 9, 6, 7, 4, 5};
//        System.out.println(findFirstUniqueInt(arr));
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
