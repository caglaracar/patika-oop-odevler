package com.caglar.odev1_universite;

public class Ofis {
    private String ofisNo;
    private int kat;

    public Ofis(String ofisNo, int kat) {
        this.ofisNo = ofisNo;
        this.kat = kat;
    }

    public String getOfisNo() {
        return ofisNo;
    }

    public int getKat() {
        return kat;
    }

    @Override
    public String toString() {
        return "Ofis " + ofisNo + " (Kat " + kat + ")";
    }
}
