package ru.kazim.generics;

public class Doc extends Animal {
    int id;

    public Doc setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "Doc{id=\"" + id + "\"}";
    }
}
