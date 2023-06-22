package org.example;

public class Unggas {

    String tipeUnggas;
    int umur;

    public Unggas(String tipeUnggas, int umur){
        this.tipeUnggas = tipeUnggas;
        this.umur = umur;
    }

    public String getTipeUnggas(){
        return tipeUnggas;
    }

    public void minum(String caraMinum){
        System.out.println(this.tipeUnggas + " ini minum dengan cara " + caraMinum);
    }

    public void makan(String caraMakan){
        System.out.println(this.tipeUnggas + " ini makan dengan cara " + caraMakan);
    }

    public void showUmur(){
        System.out.println(this.tipeUnggas + " ini umurnya = " + this.umur);
        System.out.println("Angka kehidupan = " + hitungAngkaKehidupan());
    }

    private int hitungAngkaKehidupan(){
        return this.umur + 100;
    }
}
