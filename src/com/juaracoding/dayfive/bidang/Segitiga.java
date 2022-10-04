package com.juaracoding.dayfive.bidang;

public class Segitiga {

        //Prosedur
        public static void draw(int sisi) {
            for (int i = 0; i < sisi+1; i++) {          //Tanpa parameter default method
                for (int j = 0; j < i; j++) {           //Jika berbeda package harus pakai public
                    System.out.print("* ");
                }
                System.out.println();
        }
    }
}
