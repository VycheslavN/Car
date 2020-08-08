package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        Car ford = new Car(2018,"Kuga", 200);
        Car niva = new Car(2015,"Lada", 150);

        cars.add(ford);
        cars.add(niva);

        Comparator speedComparator = new MaxSpeedCarComparator();
        Collections.sort(cars, speedComparator);

        System.out.println(cars);// write your code here
    }
}
