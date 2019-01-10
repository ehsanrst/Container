package com.practise;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Practice {
    public static void main(String[] args) {

        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.speed.compareTo(o2.speed);
            }
        };

        Set<Car> cars1 = new TreeSet<>(comparator); //arrange with speed
        Collections.addAll(cars1, new Car("Pride", 20, 200),
                new Car("Samand", 25, 180));

        Set<Car> cars2 = new TreeSet<>(cars1); //arrange with price

        for (Car car : cars1) {
            System.out.println(car.name);
        }

        for (Car car : cars2) {
            System.out.println(car.name);
        }

    }
}
