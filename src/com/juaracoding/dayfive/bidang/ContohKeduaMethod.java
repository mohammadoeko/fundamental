package com.juaracoding.dayfive.bidang;

import com.juaracoding.dayfive.bidang.BilanganGenap;

import java.util.Scanner;

public class ContohKeduaMethod {
    public static void main(String[] args) {
        // 2 4 5 8 10
        // 12 14 16 18 20

//        TesSatu tesSatu = new TesSatu();
//        tesSatu.genapSatu(20);

        Scanner scanner = new Scanner(System.in);

        BilanganGenap bilanganGenap = new BilanganGenap();
        bilanganGenap.deret(0, 11);
        System.out.printf("\n");
        bilanganGenap.deret(11, 21);

    }
}
