package com.juaracoding.dayfive.bidang;

public class BilanganGenap {

    //Prosedur
    void deret(int awal, int akhir) {           //Hanya void karena sama berada dalam 1 package
        for (int i = awal; i<akhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i+ " ");
            }
        }
    }
}
