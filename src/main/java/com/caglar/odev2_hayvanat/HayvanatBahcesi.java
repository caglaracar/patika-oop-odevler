package com.caglar.odev2_hayvanat;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi {
    private String ad;
    private List<Hayvan> hayvanlar = new ArrayList<>();

    public HayvanatBahcesi(String ad) {
        this.ad = ad;
    }

    public void hayvanEkle(Hayvan h) {
        hayvanlar.add(h);
    }

    public void raporYazdir() {
        System.out.println("=== " + ad + " ===");
        for (Hayvan h : hayvanlar) {
            System.out.println(h);
            System.out.println("  Doz: " + h.getDosage() + " ml");
            System.out.println("  Beslenme: " + h.getFeedSchedule());
        }
    }
}
