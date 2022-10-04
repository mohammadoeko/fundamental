package com.juaracoding.daythree;

public class OperatorBitwise {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 5;
        b = 3;
        c = a & b; // 0101 & 011
        d = a | b; // 0101 | 0011
        System.out.println(c);
        System.out.println(d);
    }
}
