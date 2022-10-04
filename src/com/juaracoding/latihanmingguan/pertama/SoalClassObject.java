package com.juaracoding.latihanmingguan.pertama;

import java.util.Scanner;

public class SoalClassObject {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Computer computer1 = new Computer();
        // complete the code
        computer1.processor = scan.next();
        computer1.motherboard = scan.next();
        computer1.ram = scan.nextInt();
        computer1.xRam = scan.nextInt();
        computer1.gpu = scan.next();
        computer1.harddisk = scan.next();
        computer1.displaySpec();
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
