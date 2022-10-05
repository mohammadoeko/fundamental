package com.juaracoding.dayeight;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int hasil = 100/0;
        } catch (ArithmeticException e) {
//            e.printStackTrace();
//            System.err.println(e);
            System.err.println("Modifikasi Nama Error");
        }
        System.out.println("Statement Kedua");

        String browser = null;
        try {
            System.out.println(browser.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        System.out.println("Statement Keempat");
    }
}
