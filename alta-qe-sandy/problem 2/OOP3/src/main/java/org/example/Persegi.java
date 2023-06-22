package org.example;

public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int LuasPersegi() {
        return sisi*sisi;
    }

    public int KelilingPersegi() {
        return 4 * sisi;
    }
}
