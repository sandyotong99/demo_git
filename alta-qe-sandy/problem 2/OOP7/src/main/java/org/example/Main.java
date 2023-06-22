package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ongkir hitung = new Ongkir();
        String opsi;

        System.out.println("Simulasi Hitung Ongkos Kirim");
        System.out.println("============================");

        do {
            hitung.inputInformasi();
            double totalHarga = hitung.hitungOngkir();
            System.out.println("Total Harga Pengiriman: Rp." + totalHarga);
            System.out.print("Mau coba menghitung lagi? (Y/N): ");
            opsi = input.next();

            if (opsi.equalsIgnoreCase("N")) {
                System.out.println("                    *                   ");
                System.out.println("                *  Good *               ");
                System.out.println("              *    Bye    *             ");
                System.out.println("               *   See   *              ");
                System.out.println("                 * You *                ");
                System.out.println("                    *                   ");
            }
        } while (opsi.equalsIgnoreCase("Y"));
    }
}