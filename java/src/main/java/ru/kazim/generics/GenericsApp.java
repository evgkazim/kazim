package ru.kazim.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsApp {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal().setName("animal"));
        animals.add(new Animal().setName("animal"));
        animals.add(new Animal().setName("animal"));

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat().setId(1));
        cats.add(new Cat().setId(2));

        List<Doc> docs = new ArrayList<>();
        docs.add(new Doc().setId(3));
        docs.add(new Doc().setId(4));

        print(animals);
        print(cats);
        print(docs);
    }

    static void print(List<? extends Animal> list) {
        for (Object entity: list) {
            System.out.println(entity);
        }
    }
}
