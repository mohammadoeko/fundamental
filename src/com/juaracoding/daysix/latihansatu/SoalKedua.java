package com.juaracoding.daysix.latihansatu;

import java.util.ArrayList;

public class SoalKedua {
    public static void main(String[] args) {
        ArrayList<String> kalimat = new ArrayList<>();
        kalimat.add("hanip");
        kalimat.add("cakep");
        System.out.println("Ini adalah output pertama : " +kalimat);
        kalimat.set(0, "saya");
        System.out.println("Ini adalah output kedua : " +kalimat);
    }
}
