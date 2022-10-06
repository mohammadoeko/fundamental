package com.juaracoding.dayeight.postest;

import java.util.Scanner;

public class SoalPertama {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int angkaPertama = scan.nextInt();
        int angkaKedua = scan.nextInt();
        try {
            int hasil = angkaPertama/angkaKedua;
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero\n");
        }

        System.out.println("Eksekusi code berikutnya");
        System.out.println("Ket:");
        System.out.println("A = " + angkaPertama + ", " + "B = " +angkaKedua);
    }
}
