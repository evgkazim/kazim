package ru.kazim.patterns.pattern.decorator;

import ru.kazim.patterns.common.car.Car;

public class CarDecorator implements Car {
    private final Car car;
    private int speed;

    private int maxSpeed;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public CarDecorator addSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public CarDecorator addMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    @Override
    public int speed() {
        return car.speed() + speed;
    }

    @Override
    public int maxSpeed() {
        return car.maxSpeed() + maxSpeed;
    }
}
