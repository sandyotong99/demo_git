package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputVolume;

        System.out.println("Formula Perhitungan Volume Bangun Ruang");

        do {
            System.out.println("pilih inputan bangun ruang yang akan dihitung");
            System.out.println("A. Kubus");
            System.out.println("B. Balok");
            System.out.println("C. Tabung");
            System.out.println("Silahkan pilih hurufnya (A/B/C) : ");

            String jenis = scan.next();

            if (jenis.equalsIgnoreCase("A")) {
                System.out.println("Nilai sisi kubus nya mau berapa? : ");
                int sisi = scan.nextInt();

                formulaKubus hasilkubus = new formulaKubus(sisi);
                System.out.println("Hasil volume kubus = " + hasilkubus.getVolume() + " cm3");
                System.out.println("Mau coba hitung lagi ga? (Y/N) : ");

                inputVolume = scan.next();
            } else if (jenis.equalsIgnoreCase("B")) {
                System.out.println("Nilai panjang baloknya mau berapa? : ");
                int panjang = scan.nextInt();

                System.out.println("Nilai lebar baloknya? : ");
                int lebar = scan.nextInt();

                System.out.println("Nilai tinggi baloknya? : ");
                int tinggi = scan.nextInt();

                formulaBalok hasilbalok = new formulaBalok (panjang, lebar, tinggi);
                System.out.println("Hasil volume balok = " + hasilbalok.getVolume() + " cm3");
                System.out.println("Mau coba hitung lagi ga? (Y/N) : ");

                inputVolume = scan.next();
            } else if (jenis.equalsIgnoreCase("C")) {
                System.out.println("Nilai jari-jari tabung mau berapa? : ");
                int jarijari = scan.nextInt();

                System.out.println("Nilai tinggi tabungnya? : ");
                int tinggi2 = scan.nextInt();

                formulaTabung hasiltabung = new formulaTabung(jarijari,tinggi2);
                System.out.println("Hasil volume tabung = " + hasiltabung.getVolume() + " cm3");
                System.out.println("Mau coba hitung lagi ga? (Y/N) : ");

                inputVolume = scan.next();
            } else {System.out.println("===============================================");
                System.out.println("Maaf Jenis bangun ruang yang dipilih tidak tersedia");
                System.out.println("Apakah mau pilih ulang menu nya? (Y/N) : ");

                inputVolume = scan.next();
                if (inputVolume.equalsIgnoreCase("N")) {
                    System.out.println("                    *                   ");
                    System.out.println("                *  Good *               ");
                    System.out.println("              *    Bye    *             ");
                    System.out.println("               *   See   *              ");
                    System.out.println("                 * You *                ");
                    System.out.println("                    *                   ");
                }
            }
        } while (inputVolume.equalsIgnoreCase("Y"));
    }
}