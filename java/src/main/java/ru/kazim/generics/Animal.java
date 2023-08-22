package ru.kazim.generics;

public class Animal {
    String name;

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Animal{name=\"" + name + "\"}";
    }
}
