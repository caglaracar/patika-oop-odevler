package com.caglar.odev1_universite;

public abstract class Calisan {
    protected String ad;
    protected String soyad;
    protected Ofis ofis;

    public Calisan(String ad, String soyad, Ofis ofis) {
        this.ad = ad;
        this.soyad = soyad;
        this.ofis = ofis;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public Ofis getOfis() {
        return ofis;
    }

    public abstract void gorevYap();
}
