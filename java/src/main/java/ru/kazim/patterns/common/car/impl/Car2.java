package ru.kazim.patterns.common.car.impl;


import ru.kazim.patterns.common.car.Car;

public record Car2(int speed) implements Car {

    @Override
    public int maxSpeed() {
        return 200;
    }
}
