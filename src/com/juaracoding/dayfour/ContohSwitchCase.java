package com.juaracoding.dayfour;

public class ContohSwitchCase {
    public static void main(String[] args) {
        int pilihMenu = 1;
        switch (pilihMenu) {
            case 1:
                System.out.println("Tampilkan Data");
                break;
            case 2:
                System.out.println("Tambah Data");
                break;
            case 3:
                System.out.println("Edit/Update Data");
                break;
            case 4:
                System.out.println("Hapus Data");
                break;
            default:
                System.out.println("Menu tidak ada");
                break;
        }
    }
}
