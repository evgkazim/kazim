package ru.kazim.patterns.pattern.factory;


import ru.kazim.patterns.common.car.Car;
import ru.kazim.patterns.common.car.impl.Car1;
import ru.kazim.patterns.common.car.impl.Car2;
import ru.kazim.patterns.common.car.impl.Car3;

public class CarFactory {
    public static Car create(int speed, CarType carType) {
        return switch (carType) {
            case CAR_1 -> new Car1(speed);
            case CAR_2 -> new Car2(speed);
            case CAR_3 -> new Car3(speed);
            default -> throw new IllegalStateException("Unexpected value: " + carType);
        };
    }
}
