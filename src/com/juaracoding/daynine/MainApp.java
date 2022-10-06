package com.juaracoding.daynine;

public class MainApp {
    public static void main(String[] args) {
        Button button = new Button();

        button.setClickAction(new Clickable() {
            @Override
            public void onClick() {                             // function tanpa lambda
                System.out.println("Tombol sudah di klik");
                System.out.println("Berhasil");
            }
        });

        button.doClick();

        Button buttonTwo = new Button();

        buttonTwo.setClickAction(() -> {       // () function anonymous / menggunakan lambda
            System.out.println("Tombol sudah diklik");
            System.out.println("Berhasil");
        });

        buttonTwo.doClick();
    }
}
