package org.example;

public class formulaTabung {
    int jarijari;
    int tinggi;

    public formulaTabung(int jarijari, int tinggi) {
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }

    public double getVolume() {
        return Math.PI * jarijari * jarijari * tinggi;
    }
}
