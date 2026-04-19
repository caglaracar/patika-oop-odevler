package com.caglar.odev3_ucus;

public class Havaalani {
    private String id;
    private String ad;

    public Havaalani(String id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    public String getId() { return id; }
    public String getAd() { return ad; }

    @Override
    public String toString() {
        return ad + " (" + id + ")";
    }
}
