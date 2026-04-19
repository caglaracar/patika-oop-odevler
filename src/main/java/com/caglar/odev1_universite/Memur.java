package com.caglar.odev1_universite;

public class Memur extends Calisan {
    private String gorev;

    public Memur(String ad, String soyad, Ofis ofis, String gorev) {
        super(ad, soyad, ofis);
        this.gorev = gorev;
    }

    public String getGorev() {
        return gorev;
    }

    @Override
    public void gorevYap() {
        System.out.println("Memur " + ad + " " + soyad + " " + gorev + " işini yapıyor.");
    }
}
