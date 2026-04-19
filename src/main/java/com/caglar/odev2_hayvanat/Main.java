package com.caglar.odev2_hayvanat;

public class Main {
    public static void main(String[] args) {
        HayvanatBahcesi hb = new HayvanatBahcesi("Kodluyoruz Hayvanat Bahçesi");

        hb.hayvanEkle(new At("Zebra", 300, 5));
        hb.hayvanEkle(new At("Eşek", 180, 7));
        hb.hayvanEkle(new Kedigil("Aslan", 190, 6));
        hb.hayvanEkle(new Kedigil("Kaplan", 220, 4));
        hb.hayvanEkle(new Kemirgen("Kunduz", 20, 2));
        hb.hayvanEkle(new Kemirgen("Sıçan", 0.4, 1));

        hb.raporYazdir();
    }
}
