package com.juaracoding.dayfour;

public class InsertingArray {
    public static void main(String[] args) {
        int[] myArray1 = {3,6,3,3,4,};
        int[] myArray2 = {1,6};
        int insertAt = 3;

        int[] myArray3 = new int[myArray1.length+myArray2.length];

        for (int i = 0; i < insertAt; i++) {
            myArray3[i] = myArray1[i];
        }

        for (int j = insertAt; j < insertAt + myArray2.length; j++) {
            myArray3[j] = myArray2[j-insertAt];
        }

        for (int k = insertAt + myArray2.length; k < myArray3.length; k++) {
            myArray3[k] = myArray1[k-myArray2.length];
        }
    }
}
