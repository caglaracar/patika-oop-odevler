package com.caglar.odev2_hayvanat;

public class Kedigil extends Hayvan {

    public Kedigil(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
        // kedigiller için doz: kg başına 0.08 ml
        return agirlik * 0.08;
    }

    @Override
    public String getFeedSchedule() {
        return "Kedigiller günde bir kez, 19:00'da çiğ et ile beslenir.";
    }
}
