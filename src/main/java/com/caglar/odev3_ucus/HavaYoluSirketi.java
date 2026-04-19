package com.caglar.odev3_ucus;

import java.util.ArrayList;
import java.util.List;

public class HavaYoluSirketi {
    private String id;
    private String ad;
    private List<Ucak> ucaklar = new ArrayList<>();
    private List<Pilot> pilotlar = new ArrayList<>();
    private List<Ucus> ucuslar = new ArrayList<>();

    public HavaYoluSirketi(String id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    public void ucakEkle(Ucak u) { ucaklar.add(u); }
    public void pilotEkle(Pilot p) { pilotlar.add(p); }
    public void ucusEkle(Ucus u) { ucuslar.add(u); }

    public String getId() { return id; }
    public String getAd() { return ad; }
    public List<Ucus> getUcuslar() { return ucuslar; }
}
