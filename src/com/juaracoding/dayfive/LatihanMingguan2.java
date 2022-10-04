package com.juaracoding.dayfive;

import java.util.Scanner;

public class LatihanMingguan2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Computer computer1 = new Computer();
         //complete the code
        computer1.processor = scan.next();
        computer1.motherboard = scan.next();
        computer1.ram = scan.nextInt();
        computer1.xRam = scan.nextInt();
        computer1.gpu = scan.next();
        computer1.harddisk = scan.next();
        computer1.displaySpec();

//        computer1.processor = "Intel";
//        computer1.motherboard = "Gigabyte";
//        computer1.ram = 4096;
//        computer1.xRam = 1;
//        computer1.gpu = "Nvidia";
//        computer1.harddisk = "Seagate";
//        computer1.displaySpec();
    }
}

class Computer {
    int ram;
    String gpu;
    String harddisk;
    String motherboard;
    String processor;
    int xRam;

    void displaySpec() {

        System.out.print("Processor: " +processor + ", ");
        System.out.print("Motherboard: "+motherboard + ", ");
        System.out.print("RAM: "+ram + "x" +xRam + ", ");
        System.out.print("GPU: "+gpu + ", ");
        System.out.print("Harddisk: "+harddisk);
    }
}
