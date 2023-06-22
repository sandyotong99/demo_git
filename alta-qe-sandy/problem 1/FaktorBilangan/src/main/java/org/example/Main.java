package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opsi;
        do {

            System.out.println(" *Mari mencari faktor bilangan* ");
            System.out.println("===============================");

            System.out.println("Input angka yang di inginkan : ");
            int angka = input.nextInt();
            System.out.println("Berikut Daftar Angka untuk faktor bilangan " + angka + " yaitu: ");
            for (int i = 1; i <= angka; i++) {
                if (angka % i == 0) {
                    System.out.println(i + " ");
                }
            }

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





