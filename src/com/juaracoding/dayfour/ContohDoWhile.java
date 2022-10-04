package com.juaracoding.dayfour;

public class ContohDoWhile {
    public static void main(String[] args) {
//        int x = 0;
//        do {
//            System.out.println(x+ " JuaraCoding");
//            x++;
//        } while (x < 5);

        int i = 0;
        do {
            i++;
            if (i%2==0) {
                System.out.print(i);
            }
        } while (i<=10);
        System.out.print("");
    }
}
