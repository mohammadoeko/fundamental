package com.juaracoding.daytwo;

public class Main {

    int x = 5;

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Hello world!");
//        System.out.println(x);
        Main main = new Main();
        main.nameMethod();
    }

    void nameMethod() {
        int y = this.x;
        System.out.println(y);
    }
}