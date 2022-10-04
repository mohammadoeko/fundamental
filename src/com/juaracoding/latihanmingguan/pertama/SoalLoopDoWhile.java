package com.juaracoding.latihanmingguan.pertama;

import java.util.Scanner;

public class SoalLoopDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int angkaPertama = scan.nextInt();
        int angkaKedua = scan.nextInt();
        do {
            System.out.print(i + " ");
            i+=2;
        } while (i <=angkaPertama);

        System.out.println();

        do {
            if (angkaKedua % 4 == 0) {
                System.out.print(angkaKedua + " ");
                angkaKedua -=4;
            } else if (angkaKedua %4 == 2) {
                System.out.print((angkaKedua-2) + " ");
                angkaKedua -=4;
            }
        } while (angkaKedua>= 0);
    }
}
