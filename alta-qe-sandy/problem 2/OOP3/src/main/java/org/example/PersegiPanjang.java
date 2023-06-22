package org.example;

public class PersegiPanjang {
    public double panjang;
    public double lebar;

    public PersegiPanjang(double p, double l) {
        this.panjang = p;
        this.lebar = l;
    }

    public double hitungLuas() {
        return this.panjang * this.lebar;
    }

    public double hitungKeliling() {
        return 2 * (this.panjang + this.lebar);
    }

    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(4, 5);

    }
}

