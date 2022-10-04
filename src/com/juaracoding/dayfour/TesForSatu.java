package com.juaracoding.dayfour;

public class TesForSatu {
    public static void main(String[] args) {
        //Outer
        for (int i = 0; i < 5; i++) {
            //Inner
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("---------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-----------");

        for (int i = 1; i <= 5; i++) { // Hanya menghitung sebuah baris
            if (i % 2 == 1) {
                for (int j = i; j <= 5; j++){
                    if (j % 2 == 1) {
                        System.out.print(j+ " ");
                    }
                }
            }
            System.out.println();

            System.out.println("-----------");

        }

        //Outer terajhir dicetak
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                for (int j = i; j <= 10; j++) { //Mencetak inner terlebih duhulu
                    if (j % 2 == 0) {
                        System.out.print(j+ " ");
                    }
                }
            }
            System.out.println();
        }

        System.out.println("----------");

        for (int i = 10; i >= 1; i--) {
            if (i % 2== 0) {
                for (int j = i; j >= 1; j--) {   // j >= i akan menjadi segitiga yang lancip diatas kalau j = i akan menjadi yang lancip dibawah (nilai akhir)
                    if (j % 2 == 0) {
                        System.out.print(j+ " ");
                    }
                }
            }
            System.out.println();
        }

        System.out.println("----------");

        for (int i = 10; i >= 1; i--) {
            if (i % 2 == 0) {
                for (int j = 10; j >= i; j--) {   // j >= i akan menjadi segitiga yang lancip diatas kalau j = i akan menjadi yang lancip dibawah (nilai akhir)
                    if (j % 2 == 0) {
                        System.out.print(j+ " ");
                    }
                }
            }
            System.out.println();
        }

    }
}
