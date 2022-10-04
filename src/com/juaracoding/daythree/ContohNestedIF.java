package com.juaracoding.daythree;

public class ContohNestedIF {
    public static void main(String[] args) {
        //Program Donor Darah
        //Usia min 17 tahun dan BB min 55
        int usia = 17, beratBadan = 55;
        if (usia >= 17) {
            if (beratBadan >= 55) {
                    System.out.println("Bisa donor darah");
            } else {
                System.out.println("Belum bisa donor darah karena berat badan kurang dari 55");
            }
        } else {
            System.out.println("Belum bisa donor darah karena usia kurang dari 17 tahun");
        }
    }
}
