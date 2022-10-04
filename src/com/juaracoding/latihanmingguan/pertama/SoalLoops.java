package com.juaracoding.latihanmingguan.pertama;

import java.util.Scanner;

public class SoalLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angkaPertama = scan.nextInt(), angkaKedua = scan.nextInt();
        int i,j;

        for (i = angkaPertama; i <= angkaPertama; i++) {
            for (j = angkaPertama; j < angkaKedua; j++) {
                if (j % 3 == 0) {
                    {
                        System.out.println(i + " x " + j + " = " + i * j);
                    }
                }
            }
        }
    }
}
