package com.juaracoding.dayfour;

public class LoopingArray {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            for (int i = 0; i < cars.length; i++) { // Menggunakan cars.length untuk melooping sesuai banyak data di dalam array
                System.out.println(cars[i]);
            }

        System.out.println("---------");

            for (String j : cars) {
                System.out.println(j);  //Looping dengan menggunakan for each
            }
        }
    }
