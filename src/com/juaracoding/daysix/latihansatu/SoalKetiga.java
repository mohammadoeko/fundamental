package com.juaracoding.daysix.latihansatu;

import java.util.ArrayList;

public class SoalKetiga {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add(0,"Mazda");
        System.out.println(cars);
    }
}
