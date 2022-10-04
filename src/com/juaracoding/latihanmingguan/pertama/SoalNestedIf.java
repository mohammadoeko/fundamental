package com.juaracoding.latihanmingguan.pertama;

import java.util.Scanner;

public class SoalNestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tanggal = scan.nextInt();
        int platNomor = scan.nextInt();

        if (tanggal % 2 == 0) {
            if (platNomor % 2 == 0) {
                System.out.println("Tanggal genap dan plat nomor genap");
            } else {
                System.out.println("Tanggal genap dan plat nomor ganjil");
            }
        } else {
            System.out.println("Tanggal ganjil dan plat nomor ganjil");
        }
    }
}
