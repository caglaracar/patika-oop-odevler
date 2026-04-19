package com.caglar.odev3_ucus;

public class Main {
    public static void main(String[] args) {
        HavaYoluSirketi thy = new HavaYoluSirketi("TK", "Türk Hava Yolları");

        Havaalani ist = new Havaalani("IST", "İstanbul Havalimanı");
        Havaalani esb = new Havaalani("ESB", "Ankara Esenboğa");

        Ucak ucak1 = new Ucak("TC-JJA", "Boeing 737", 2);
        Ucak ucak2 = new Ucak("TC-JJB", "Airbus A320", 2);
        ucak2.setDurum(UcakDurumu.ONARIMDA);
        thy.ucakEkle(ucak1);
        thy.ucakEkle(ucak2);

        Pilot p1 = new Pilot("Mehmet", "Kara", 15);
        Pilot p2 = new Pilot("Ali", "Yıldız", 8);
        thy.pilotEkle(p1);
        thy.pilotEkle(p2);

        Ucus u1 = new Ucus("TK101", ist, esb, "09:00", "10:15", ucak1, p1, p2);
        thy.ucusEkle(u1);

        System.out.println("Şirket: " + thy.getAd());
        for (Ucus u : thy.getUcuslar()) {
            u.bilgileriYazdir();
        }
    }
}
