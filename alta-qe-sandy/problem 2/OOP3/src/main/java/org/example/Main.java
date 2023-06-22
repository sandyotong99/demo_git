package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLuasdanKeliling;

        do {
            System.out.println("Perhitungan Luas & Keliling Bangun Datar");
            System.out.println("Silahkan pilih bangun datar yang ingin dihitung");
            System.out.println("A. Persegi");
            System.out.println("B. Segitiga");
            System.out.println("C. Persegi Panjang");
            System.out.print("Silahkan pilih huruf (A/B/C) : ");
            String jenis = scan.next();

            switch (jenis.toUpperCase()) {
                case "A":
                    System.out.print("Masukan angka sisi persegi : ");
                    int sisi = scan.nextInt();
                    Persegi hasilpersegi = new Persegi(sisi);
                    System.out.println("hasil luas persegi = " + hasilpersegi.LuasPersegi() + " cm²");
                    System.out.println("hasil keliling persegi = " + hasilpersegi.KelilingPersegi() + " cm");
                    break;

                case "B":
                    System.out.print("Masukan angka alas segitiga : ");
                    double alas = scan.nextDouble();
                    System.out.print("Masukan tinggi segitiga : ");
                    double tinggi = scan.nextDouble();
                    Segitiga hasilsegitiga = new Segitiga(alas, tinggi);
                    System.out.println("hasil luas segitiga = " + hasilsegitiga.hitungLuas() + " cm²");
                    System.out.println("hasil keliling segitiga = " + hasilsegitiga.hitungKeliling() + " cm");
                    break;

                case "C":
                    System.out.print("Masukan panjang dari persegi panjang : ");
                    double panjang2 = scan.nextInt();
                    System.out.print("Masukan  lebar dari  persegi panjang : ");
                    double lebar2 = scan.nextInt();
                    PersegiPanjang hasilppanjang = new PersegiPanjang(panjang2, lebar2);
                    System.out.println("hasil luas persegi panjang = " + hasilppanjang.hitungLuas() + " cm²");
                    System.out.println("hasil keliling persegi panjang = " + hasilppanjang.hitungKeliling() + " cm");
                    break;

                default:
                    System.out.println("Jenis bangun datar yang dipilih tidak tersedia, ayo pilih ulang");
                    break;
            }

            System.out.println("=========================================");
            System.out.print("Apakah anda ingin menghitung lagi? (Y/N) : ");
            inputLuasdanKeliling = scan.next();
            if (inputLuasdanKeliling.equalsIgnoreCase("N")) {
                System.out.println("                    *                   ");
                System.out.println("                *  Good *               ");
                System.out.println("              *    Bye    *             ");
                System.out.println("               *   See   *              ");
                System.out.println("                 * You *                ");
                System.out.println("                    *                   ");
            }
        } while (inputLuasdanKeliling.equalsIgnoreCase("Y"));
    }
}