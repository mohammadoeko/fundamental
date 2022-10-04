package com.juaracoding.latihanmingguan.pertama;

import java.util.Scanner;

public class SoalSwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pilihMenu = scan.next();
        switch (pilihMenu) {
            case "Weekday":
                System.out.print("Senin Selasa Rabu Kamis Jum'at");
                break;
            case "Weekend":
                System.out.print("Sabtu Minggu");
                break;
            default:
                System.out.print("Invalid input");
        }
    }
}
