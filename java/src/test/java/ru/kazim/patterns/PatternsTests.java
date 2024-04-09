package ru.kazim.patterns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.kazim.patterns.common.car.Car;
import ru.kazim.patterns.pattern.factory.CarType;
import ru.kazim.patterns.common.car.impl.Car1;
import ru.kazim.patterns.common.car.impl.Car2;
import ru.kazim.patterns.common.car.impl.Car3;
import ru.kazim.patterns.pattern.decorator.CarDecorator;
import ru.kazim.patterns.pattern.factory.CarFactory;

public class PatternsTests {
    @Test
    public void factory() {
        Car car1 = CarFactory.create(100, CarType.CAR_1);
        Car car2 = CarFactory.create(120, CarType.CAR_2);
        Car car3 = CarFactory.create(140, CarType.CAR_3);

        Assertions.assertEquals(car1.speed(), 100);
        Assertions.assertEquals(car2.speed(), 120);
        Assertions.assertEquals(car3.speed(), 140);
    }

    @Test
    public void decorator() {
        Car car1 = new CarDecorator(new Car1(100)).addSpeed(25);
        Car car2 = new CarDecorator(new Car2(120)).addSpeed(25);
        Car car3 = new CarDecorator(new Car3(140)).addSpeed(25).addMaxSpeed(20);

        Assertions.assertEquals(car1.speed(), 125);
        Assertions.assertEquals(car2.speed(), 145);
        Assertions.assertEquals(car3.speed(), 165);

        Assertions.assertEquals(car1.maxSpeed(), 200);
        Assertions.assertEquals(car2.maxSpeed(), 200);
        Assertions.assertEquals(car3.maxSpeed(), 220);
    }
}
