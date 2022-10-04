package com.juaracoding.dayfour;

public class ArrayMultidimensi {
    public static void main(String[] args) {
        int [][] angkaKu = {{1,2,3,4,5}, {6,7,8,9,10}};  //Membuat array dengan mutidimensi (terdapat 2 array)
        int x = angkaKu[0][2]; // Artinya array kedua (1) akses di elemen ketiga (2)
        int y = angkaKu[1][2];

        System.out.println(x);
        System.out.println(y);

        System.out.println("---------");

        int [][] myNumbers = {{1,2,3,4}, {5,6,7}};
        for (int i = 0; i < myNumbers.length; ++i) {            // Melakukan looping mendapatkan element dari dua array
            for (int j = 0; j < myNumbers[i].length;  ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        System.out.println("-----------");

        int [] myArray = {1,2,3,4,5};

        for (int i = myArray.length - 1; i>0; i--) {        //Mengurutkan element pada array
            System.out.println(myArray[i]);
        }
    }
}
