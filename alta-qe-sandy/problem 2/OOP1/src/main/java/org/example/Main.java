package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tipe = input.nextLine();
        int umur = input.nextInt();
        Unggas unggas = new Unggas(tipe, umur);

        unggas.makan("Di restoran");
        unggas.showUmur();

        Unggas unggas2 = new Unggas("Bebek", 50);
        unggas2.minum("Dikokop");
        unggas2.showUmur();
    }
}
