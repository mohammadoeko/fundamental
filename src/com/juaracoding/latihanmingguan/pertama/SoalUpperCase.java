package com.juaracoding.latihanmingguan.pertama;

import java.util.Scanner;

public class SoalUpperCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        SoalUpperCase karyawan = new SoalUpperCase();
        karyawan.karyawan(scan.nextLine().toUpperCase(), scan.nextLine().toUpperCase(), scan.nextInt());
    }

    void karyawan(String nama, String profesi, int salary) {
        System.out.println("Nama: " +nama);
        System.out.println("Profesi: " +profesi);
        System.out.println("Salary: " +salary);
    }
}
