package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String opsi;
        do {

        System.out.println("     Berapakah Nilaimu?      ");
        System.out.println("===============================");
        System.out.println("Masukan Nilai: ");

        int nilai = input.nextInt();
        String Peringkat =  "";

        if (nilai >= 80 && nilai <= 100) {
            Peringkat = "A";
        } else if (nilai >= 65 && nilai <= 79) {
            Peringkat = "B+";
        } else if (nilai >= 50 && nilai <= 64) {
            Peringkat = "B";
        } else if (nilai >= 35 && nilai <= 49) {
            Peringkat = "C";
        } else if (nilai >= 0 && nilai <= 34) {
            Peringkat = "D";
        }

        System.out.println("===============================");

        System.out.println("Nilai :"  + nilai +  "");
        System.out.println( "Peringkat :" + Peringkat + "");

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