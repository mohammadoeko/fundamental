package com.juaracoding.latihanmingguan;

import java.util.Scanner;

public class SubStringKedua {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean pertama = true;

        if (pertama == true) {
            //Lengkapi
            SubStringKedua mahasiswa1 = new SubStringKedua();
            mahasiswa1.tampilkan(scan.nextLine().toUpperCase(), scan.nextLong());

        } else {
            SubStringKedua mahasiswa2 = new SubStringKedua();
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

