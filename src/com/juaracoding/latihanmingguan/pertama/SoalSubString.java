package com.juaracoding.latihanmingguan.pertama;

import java.util.Scanner;

public class SoalSubString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean pertama = true;

        if (pertama == true) {
            //Lengkapi
            SoalSubString mahasiswa1 = new SoalSubString();
            mahasiswa1.tampilkan(scan.nextLine().toUpperCase(), scan.nextLong());

        } else {
            SoalSubString mahasiswa2 = new SoalSubString();
            mahasiswa2.tampilkan(scan.next().toUpperCase(), scan.nextLong());
        }

    }

    void tampilkan(String nama,long nim) {
        String s = Long.toString(nim);

        System.out.println("Nama: " +nama);
        System.out.println("NIM: " +nim);
        System.out.println("Tahun Masuk: "+s.substring(0,4));
    }
}
