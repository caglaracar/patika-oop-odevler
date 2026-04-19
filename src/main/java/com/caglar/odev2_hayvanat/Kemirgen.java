package com.caglar.odev2_hayvanat;

public class Kemirgen extends Hayvan {

    public Kemirgen(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
        // kemirgenler için doz: kg başına 0.02 ml
        return agirlik * 0.02;
    }

    @Override
    public String getFeedSchedule() {
        return "Kemirgenler günde 3 kez küçük porsiyonlar halinde beslenir.";
    }
}
