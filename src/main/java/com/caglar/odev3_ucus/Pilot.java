package com.caglar.odev3_ucus;

public class Pilot {
    private String ad;
    private String soyad;
    private int deneyimSeviyesi; // yıl

    public Pilot(String ad, String soyad, int deneyimSeviyesi) {
        this.ad = ad;
        this.soyad = soyad;
        this.deneyimSeviyesi = deneyimSeviyesi;
    }

    public String getAd() { return ad; }
    public String getSoyad() { return soyad; }
    public int getDeneyimSeviyesi() { return deneyimSeviyesi; }

    @Override
    public String toString() {
        return ad + " " + soyad + " (" + deneyimSeviyesi + " yıl)";
    }
}
