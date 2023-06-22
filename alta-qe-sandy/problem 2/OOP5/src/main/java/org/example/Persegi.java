package org.example;

public class Persegi {

        int sisi;

        public Persegi(int sisi) {
            this.sisi = sisi;
        }

        public int Luas() {
            return sisi*sisi;
        }

        public int Keliling() {
            return 4 * sisi;
        }
    }

}
