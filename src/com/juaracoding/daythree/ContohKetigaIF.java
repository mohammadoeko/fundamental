package com.juaracoding.daythree;

public class ContohKetigaIF {
    public static void main(String[] args) {
        //Konversi nilai ke predikat
        // A = 91 - 100, B = 85 - 90, C = 78 - 84
        int nilai = 90;
        if (nilai > 90) {
            System.out.println("Predikat A");
        } else if (nilai > 84) {
            System.out.println("Predikat B");
        } else {
            System.out.println("Predikat C");
        }
    }
}
