package com.juaracoding.latihanmingguan;

import java.util.Scanner;

public class WhileTes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int angkaPertama = scan.nextInt(), angkaKedua = scan.nextInt(), angkaKetiga = scan.nextInt();
        System.out.println("Deret Aritmatika");

//        while (angkaPertama < angkaKedua) {
//            if (angkaPertama % angkaKetiga == 0)
//                System.out.print(angkaPertama + " ");
//                angkaPertama++;
//            }

        while (angkaPertama < angkaKedua) {
            if ((angkaPertama+angkaKedua) % angkaKetiga == 0)
                System.out.print(angkaPertama + " ");
            angkaPertama++;

        }
    }
}