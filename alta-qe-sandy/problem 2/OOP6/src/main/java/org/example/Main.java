package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        rumuskelas perhitungan = new rumuskelas();
        String inputKalkulator;
        String opsi;

        System.out.println("Simulator Kalkulator");
        System.out.println("====================");

        do {
            System.out.println("Mau perhitungan apa nih?");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.print("Silahkan pilih angka (1/2/3/4): ");
            int jenis = scan.nextInt();

            System.out.print("Input Angka Pertama: ");
            float angkaPertama = scan.nextFloat();
            System.out.print("Input Angka Kedua: ");
            float angkaKedua = scan.nextFloat();
            perhitungan.masukanAngka(angkaPertama, angkaKedua);

            switch (jenis) {
                case 1:
                    System.out.println("Hasil penjumlahan: " + perhitungan.penjumlahan());
                    break;
                case 2:
                    System.out.println("Hasil pengurangan: " + perhitungan.pengurangan());
                    break;
                case 3:
                    System.out.println("Hasil perkalian: " + perhitungan.perkalian());
                    break;
                case 4:
                    System.out.println("Hasil pembagian: " + perhitungan.pembagian());
                    break;
                default:
                    System.out.println("Menu belum tersedia, mau pilih lagi?");
                    break;
            }

            System.out.print("Apakah Anda ingin menghitung lagi? (Y/N): ");
            inputKalkulator = scan.next();
            if (inputKalkulator.equalsIgnoreCase("N")) {
                System.out.println("                    *                   ");
                System.out.println("                *  Good *               ");
                System.out.println("              *    Bye    *             ");
                System.out.println("               *   See   *              ");
                System.out.println("                 * You *                ");
                System.out.println("                    *                   ");
            }
        } while (inputKalkulator.equalsIgnoreCase("Y"));

        scan.close();
    }
}