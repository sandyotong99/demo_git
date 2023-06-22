package org.example;

public class Ongkir extends HitungBesaran {
    double totalharga;

    public double hitungOngkir() {
        double volume = Math.floor((this.panjang * this.lebar * this.tinggi) / 50);

        if (volume > Math.floor(this.berat)) {
            totalharga = volume * 5000;
        } else if (volume < Math.floor(this.berat)) {
            totalharga = Math.floor(this.berat) * 5000;
        } else if (volume == Math.floor(this.berat)) {
            totalharga = Math.floor(this.berat) * 5000;
        }

        return totalharga;
    }
}