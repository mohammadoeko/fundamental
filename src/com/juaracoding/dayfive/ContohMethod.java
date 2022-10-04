package com.juaracoding.dayfive;

import com.juaracoding.dayfive.bidang.Calculator;
import com.juaracoding.dayfive.bidang.Segitiga;

public class ContohMethod {
    public static void main(String[] args) {
        persegi(5);
        persegi(7);
        ucapSalam();
        // Instance object
        Segitiga segitiga = new Segitiga();
        segitiga.draw(5);

        Calculator calculator = new Calculator();
        int hasil = calculator.add(10, 6);
        System.out.println(hasil);
        System.out.println(calculator.add(100,20));

    }

    //Method
    static void persegi(int sisi) {  // Menggunakan parameter
        for (int i = 0; i<sisi; i++) {          //Tanpa parameter default method
            for (int j = 0; j< sisi; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void ucapSalam() {
        System.out.println("Ucap salam");
    }
}
