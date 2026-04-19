package com.caglar.odev4_film;

public class Film {
    private String ad;
    private String tur;
    private int yil;
    private int kiralamaKredisi;
    private int satisKredisi;
    private boolean mevcut;

    public Film(String ad, String tur, int yil, int kiralamaKredisi, int satisKredisi) {
        this.ad = ad;
        this.tur = tur;
        this.yil = yil;
        this.kiralamaKredisi = kiralamaKredisi;
        this.satisKredisi = satisKredisi;
        this.mevcut = true;
    }

    public String getAd() { return ad; }
    public String getTur() { return tur; }
    public int getYil() { return yil; }
    public int getKiralamaKredisi() { return kiralamaKredisi; }
    public int getSatisKredisi() { return satisKredisi; }
    public boolean isMevcut() { return mevcut; }
    public void setMevcut(boolean mevcut) { this.mevcut = mevcut; }

    @Override
    public String toString() {
        return ad + " (" + yil + ") - " + tur;
    }
}
