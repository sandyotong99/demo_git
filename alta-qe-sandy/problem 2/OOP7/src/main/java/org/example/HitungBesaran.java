package org.example;

import java.util.Scanner;

public class HitungBesaran {
    double panjang;
    double lebar;
    double tinggi;
    double berat;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void inputInformasi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Panjang Barang (Cm):  ");
        this.panjang = input.nextDouble();
        System.out.print("Masukkan Nilai Lebar Barang (Cm) :  ");
        this.lebar = input.nextDouble();
        System.out.print("Masukkan Nilai Tinggi Barang (Cm) :  ");
        this.tinggi = input.nextDouble();
        System.out.print("Masukkan Nilai Berat Barang (Kg) : ");
        this.berat = input.nextDouble();
    }
}
