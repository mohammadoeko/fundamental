package com.juaracoding.daythree;

public class TesPajak {
    public static void main(String[] args) {
        boolean status = true; //menikah (1), belum menikah (0)
        boolean gender = true; //laki-laki (1), perempuan (0)
        int pendapatan = 7100000; //pendapatan

        if (pendapatan > 7000000) {
            if (gender && true) {
                if (status && true) {
                    System.out.println("laki-laki pajak 5%");
                } else {
                    System.out.println("Laki-laki belum menikah 10%");
                }
            } else if (gender || status) {
                System.out.println("Perempuan pajak 2%");
            } else {
                System.out.println("Perempuan belum menikah 5%");
            }
        } else {
            System.out.println("Tidak wajib pajak");
        }
    }
}
