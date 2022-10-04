package com.juaracoding.dayfour;

public class ContohPertamaArray {
    public static void main(String[] args) {
        int nomor[] = {1, 2, 3, 4};
//        System.out.println(nomor[0]);
//        System.out.println(nomor[1]);
//        System.out.println(nomor[2]);
//        System.out.println(nomor[3]);
        System.out.println("Jumalah nomor = " +nomor.length);
        for (int i=0; i<nomor.length;i++) {
            System.out.println(nomor[i]);
        }
        String kota[] = {"Jakarta", "Bandung", "Lampung", "Makassar", "Kuningan"};
//        System.out.println(nomor[0]);
//        System.out.println(nomor[1]);
//        System.out.println(nomor[2]);
//        System.out.println(nomor[3]);
//        System.out.println(nomor[4]);
        System.out.println("Jumalah kota = " +kota.length);
        for (int i=0; i<kota.length;i++) {
            System.out.println(kota[i]);
        }

        System.out.println("--- For Each ---");
        for (String i : kota) {
            System.out.println(i);
        }

        // Cara deklarasi ke-2
        String nama[] = new String[5];
        nama[0] = "TEST sATU";
        System.out.println(nama[0]);
    }
}
