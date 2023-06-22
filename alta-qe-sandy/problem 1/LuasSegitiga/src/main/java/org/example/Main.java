package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String opsi;
        do {

            System.out.println(" *Mari menghitung luas segitiga* ");
            System.out.println("===============================");

            System.out.print("Masukan Alas: ");
            float Alas = input.nextFloat();

            System.out.print("Masukan Tinggi: ");
            float Tinggi = input.nextFloat();

            float luasSegitiga = (Alas * Tinggi) / 2;

            System.out.println("Luas Segitiga Adalah ; " + luasSegitiga +  " Cm ");

            System.out.println("===============================");
            System.out.println("Hitung lagi gak nih? (y/n) : ");
            opsi = input.next();
            if (opsi.equalsIgnoreCase("n")) {
                System.out.println("  ////////////yaudah nuhun\\\\\\\\\\\\\\\\\\    ");
                System.out.println("//////////sampai ketemu lagi\\\\\\\\\\\\\\\\\\ ");
            }
        } while (opsi.equalsIgnoreCase("y"));

    }
}