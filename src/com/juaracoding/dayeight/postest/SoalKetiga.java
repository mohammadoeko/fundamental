package com.juaracoding.dayeight.postest;

import java.util.Scanner;

public class SoalKetiga {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] myIndex = new int[10];
        myIndex[0] = scan.nextInt();

        try {
            int myHasil = myIndex[myIndex[0]];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Eksekusi code berikutnya");
    }
}
