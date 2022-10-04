package com.juaracoding.latihanmingguan;

import java.util.Scanner;

public class Perkalian {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angkaPertama = scan.nextInt(), angkaKedua = scan.nextInt();
        int i,j;

//        int number = 2, i, j;
//        int number2 = 7;
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
