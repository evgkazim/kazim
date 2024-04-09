package ru.kazim.patterns.pattern.factory;

public enum CarType {
    CAR_1(1, "car1"),
    CAR_2(2, "car2"),
    CAR_3(3, "car3");

    private final int id;
    private final String name;

    CarType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

}
