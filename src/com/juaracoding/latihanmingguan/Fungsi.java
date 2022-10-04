package com.juaracoding.latihanmingguan;


import java.util.Scanner;

public class Fungsi {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            Fungsi karyawan = new Fungsi();
            karyawan.karyawan(scan.nextLine().toUpperCase(), scan.nextLine().toUpperCase(), scan.nextInt());

        }

        void karyawan(String nama, String profesi, int salary) {

            System.out.println("Nama: " +nama);
            System.out.println("Profesi: " +profesi);
            System.out.println("Salary: " +salary);
        }
    }
