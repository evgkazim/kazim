package ru.kazim.generics;

public class Cat extends Animal {
    int id;

    public Cat setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                '}';
    }
}
