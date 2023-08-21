package ru.kazim.collection;

import java.util.*;

public class CollectionApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Map<String, String> map = new HashMap<>();
        map.put("one1", "one");
        map.put("one2", "one");
        map.put("one3", "one");
        map.put("one4", "one");
        map.put("one5", "one");
        System.out.println(map);
    }
}
