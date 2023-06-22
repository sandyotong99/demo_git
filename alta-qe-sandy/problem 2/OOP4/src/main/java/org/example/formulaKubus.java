package org.example;

public class formulaKubus {
    int sisi;

    public formulaKubus(int sisi) {
        this.sisi = sisi;
    }

    public int getVolume() {
        return sisi * sisi * sisi;
    }
}
