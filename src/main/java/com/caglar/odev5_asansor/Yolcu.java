package com.caglar.odev5_asansor;

public class Yolcu {
    private int id;
    private int kalkisKati;
    private int varisKati;

    public Yolcu(int id, int kalkisKati, int varisKati) {
        this.id = id;
        this.kalkisKati = kalkisKati;
        this.varisKati = varisKati;
    }

    public int getId() { return id; }
    public int getKalkisKati() { return kalkisKati; }
    public int getVarisKati() { return varisKati; }

    public Yon istenenYon() {
        return varisKati > kalkisKati ? Yon.YUKARI : Yon.ASAGI;
    }

    @Override
    public String toString() {
        return "Yolcu-" + id + " (" + kalkisKati + " -> " + varisKati + ")";
    }
}
