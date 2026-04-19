package com.caglar.odev2_hayvanat;

public class At extends Hayvan {

    public At(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
        // at için doz: kg başına 0.05 ml
        return agirlik * 0.05;
    }

    @Override
    public String getFeedSchedule() {
        return "Atlar sabah 07:00 ve akşam 18:00'de saman+yulaf ile beslenir.";
    }
}
