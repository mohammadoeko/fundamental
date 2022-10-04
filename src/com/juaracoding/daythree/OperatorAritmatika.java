package com.juaracoding.daythree;

public class OperatorAritmatika {
    public static void main(String[] args) {
        int  angkaSatu = 10, angkaDua = 20, hasil, hasilModulus, myVar, myVar2;
        hasil = angkaSatu + angkaDua;
        hasilModulus = 99 % 3;
//        System.out.println("Hasil = " +(angkaSatu+angkaDua)); Ditampung didalam blueprint
        System.out.println("Hasil = " +hasil);
        System.out.println("Hasil Modulus = " +hasilModulus);
        myVar = 5 + 2 * 3 - 2;
        myVar2 = (5 + 2) * 3;
        System.out.println(myVar);
        System.out.println(myVar2);
    }
}
