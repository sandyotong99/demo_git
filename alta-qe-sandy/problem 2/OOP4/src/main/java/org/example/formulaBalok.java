package org.example;

public class formulaBalok {
    int panjang;
    int lebar;
    int tinggi;

    public formulaBalok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int getVolume() {
        return panjang * lebar * tinggi;
    }
}
