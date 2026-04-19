package com.caglar.odev1_universite;

public class Profesor extends Calisan {
    private String bolum;

    public Profesor(String ad, String soyad, Ofis ofis, String bolum) {
        super(ad, soyad, ofis);
        this.bolum = bolum;
    }

    public String getBolum() {
        return bolum;
    }

    @Override
    public void gorevYap() {
        System.out.println("Prof. " + ad + " " + soyad + " ders veriyor. (" + bolum + ")");
    }
}
