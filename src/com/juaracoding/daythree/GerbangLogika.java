package com.juaracoding.daythree;

public class GerbangLogika {
    public static void main(String[] args) {
        boolean isA, isB, isC, isD, isE, isF, isG, isHasilAB, isHasilCDE;
        isA = 5 == 5;
        isB = 5 != 5;
        isC = 5 > 6;
        isD = 5 < 6;
        isE = 5 >= 3;
        isF = 5 <= 5;
        isG = 5 > 5;
        isHasilAB = isA && isB;
        isHasilCDE = isC || isD && isE;
        System.out.println(isA);
        System.out.println(isB);
        System.out.println(isC);
        System.out.println(isD);
        System.out.println(isE);
        System.out.println(isF);
        System.out.println(isG);
        System.out.println("------------");
        System.out.println(isHasilAB);
        System.out.println(isHasilCDE);
        System.out.println(!isHasilCDE);
    }
}
