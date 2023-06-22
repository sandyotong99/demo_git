package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String opsi;
        do {

                System.out.print("Masukkan angka: ");
                int angka = input.nextInt();

                boolean isPrime = true;

                for (int i = 2; i <= angka / 2; i++) {
                    if (angka % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                    System.out.println("===============================");
                if (isPrime) {

                    System.out.println(angka + " Adalah Bilangan Prima" );
                } else {
                    System.out.println(angka + " Bukan Bilangan Prima");

                }   System.out.println("===============================");


        System.out.println("Hitung lagi gak nih? (y/n) : ");
        opsi = input.next();
        if (opsi.equalsIgnoreCase("n")) {
            System.out.println("                    *                   ");
            System.out.println("                *  Good *               ");
            System.out.println("              *    Bye    *             ");
            System.out.println("               *   See   *              ");
            System.out.println("                 * You *                ");
            System.out.println("                    *                   ");

            }
        } while (opsi.equalsIgnoreCase("y"));


    }
}