package com.caglar.odev1_universite;

import java.util.ArrayList;
import java.util.List;

public class Universite {
    private String ad;
    private List<Siniflik> siniflikler;
    private List<Ofis> ofisler;
    private List<Departman> departmanlar;
    private List<Calisan> calisanlar;

    public Universite(String ad) {
        this.ad = ad;
        this.siniflikler = new ArrayList<>();
        this.ofisler = new ArrayList<>();
        this.departmanlar = new ArrayList<>();
        this.calisanlar = new ArrayList<>();
    }

    public void siniflikEkle(Siniflik s) { siniflikler.add(s); }
    public void ofisEkle(Ofis o) { ofisler.add(o); }
    public void departmanEkle(Departman d) { departmanlar.add(d); }
    public void calisanEkle(Calisan c) { calisanlar.add(c); }

    public String getAd() { return ad; }
    public List<Calisan> getCalisanlar() { return calisanlar; }
    public List<Departman> getDepartmanlar() { return departmanlar; }
}
