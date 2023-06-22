package org.example;

public class Segitiga {
    public double alas;
    public double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * this.alas * this.tinggi;
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(this.alas, 2) + Math.pow(this.tinggi, 2));
        return this.alas + this.tinggi + sisiMiring;
    }

    public static void main(String[] args) {
        Segitiga st = new Segitiga(3, 4);

    }
}