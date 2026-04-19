package com.caglar.odev1_universite;

import java.util.ArrayList;
import java.util.List;

public class Departman {
    private String ad;
    private List<Ofis> ofisler;

    public Departman(String ad) {
        this.ad = ad;
        this.ofisler = new ArrayList<>();
    }

    public void ofisEkle(Ofis ofis) {
        ofisler.add(ofis);
    }

    public String getAd() {
        return ad;
    }

    public List<Ofis> getOfisler() {
        return ofisler;
    }
}
