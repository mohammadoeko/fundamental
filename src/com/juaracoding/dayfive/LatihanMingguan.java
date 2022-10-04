package com.juaracoding.dayfive;

import java.util.Locale;
import java.util.Scanner;

public class LatihanMingguan {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            LatihanMingguan karyawan = new LatihanMingguan();
            karyawan.karyawan();

        }

        void karyawan() {

            String nama = "johan";
            String profesi = "qa enginer";
            int salary = 7000;

            System.out.println("Nama: " +nama);
            System.out.println("Profesi: " +profesi);
            System.out.println("Salary: " +salary);
        }
    }
