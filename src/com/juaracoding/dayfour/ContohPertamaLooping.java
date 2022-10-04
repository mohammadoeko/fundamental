package com.juaracoding.dayfour;

public class ContohPertamaLooping {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". JuaraCoding");
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i + ". JuaraCoding");
            }
        }
    }
}
