package com.caglar.odev2_hayvanat;

public abstract class Hayvan {
    protected String turAdi;
    protected double agirlik;
    protected int yas;

    public Hayvan(String turAdi, double agirlik, int yas) {
        this.turAdi = turAdi;
        this.agirlik = agirlik;
        this.yas = yas;
    }

    public String getTurAdi() { return turAdi; }
    public double getAgirlik() { return agirlik; }
    public int getYas() { return yas; }

    // Her grup kendi mantığını uygulayacak
    public abstract double getDosage();
    public abstract String getFeedSchedule();

    @Override
    public String toString() {
        return turAdi + " (" + yas + " yaşında, " + agirlik + " kg)";
    }
}
