package com.juaracoding.latihanmingguan.pertama;

import java.util.Scanner;

public class SoalIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka = scan.nextInt();
        if (angka % 2 == 1) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
