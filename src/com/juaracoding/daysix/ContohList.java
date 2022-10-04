package com.juaracoding.daysix;

import java.util.ArrayList;

public class ContohList {
    public static void main(String[] args) {
        //Collection
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Mitsubishi");
        cars.add("Toyota");
        cars.add("Suzuki");
        System.out.println(cars);
        System.out.println(cars.get(3));    //menampilkan index 3
        cars.set(1, "Mazda");               //Me-replace / edit pada index 1
        System.out.println(cars);
        System.out.println("Size: " +cars.size());    //Menampilkan length dari semua data
        cars.remove(3);               //Menghapus nilai pada index 3
        System.out.println("Remove: " +cars);
        cars.clear();                       //Menghapus semua nilai dari semua index
        System.out.println("Clear: " +cars);
    }
}
