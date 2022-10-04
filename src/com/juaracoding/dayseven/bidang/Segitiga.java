package com.juaracoding.dayseven.bidang;

public class Segitiga extends RuangBidang{

    int sisi = 1;

    public Segitiga() {

    }

    public Segitiga(int sisi) {
        this.sisi = sisi;
    }

    @Override                   //Extends kelas mangkanya ada @Override
    public void draw() {        // Draw nya harus public karena beda package
        for (int x = 0; x < sisi; x++) {
            for (int y = 0; y < x +1; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
