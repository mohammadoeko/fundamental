package com.juaracoding.latihanmingguan.pertama;

import java.util.Scanner;

public class SoalWhileLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int angkaPertama = scan.nextInt(), angkaKedua = scan.nextInt(), angkaKetiga = scan.nextInt();
        System.out.println("Deret aritmatika");

        while (angkaPertama < angkaKedua) {
            if ((angkaPertama+angkaKedua) % angkaKetiga == 0)
                System.out.print(angkaPertama + " ");
            angkaPertama++;

        }
    }
}
