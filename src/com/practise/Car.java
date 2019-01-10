package com.practise;

public class Car implements Comparable<Car> {
    public String name;
    public Integer price, speed;

    public Car(String name, Integer price, Integer speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    @Override
    public int compareTo(Car o) {
        return this.price.compareTo(o.price);
    }
}
