package com.caglar.odev3_ucus;

public class Ucus {
    private String ucusNo;
    private Havaalani kalkisHavaalani;
    private Havaalani inisHavaalani;
    private String kalkisSaati;
    private String inisSaati;
    private Ucak ucak;
    private Pilot pilot;
    private Pilot yardimciPilot;

    public Ucus(String ucusNo, Havaalani kalkis, Havaalani inis,
                String kalkisSaati, String inisSaati,
                Ucak ucak, Pilot pilot, Pilot yardimciPilot) {
        this.ucusNo = ucusNo;
        this.kalkisHavaalani = kalkis;
        this.inisHavaalani = inis;
        this.kalkisSaati = kalkisSaati;
        this.inisSaati = inisSaati;
        this.ucak = ucak;
        this.pilot = pilot;
        this.yardimciPilot = yardimciPilot;
    }

    public void bilgileriYazdir() {
        System.out.println("Uçuş " + ucusNo + ": " + kalkisHavaalani + " -> " + inisHavaalani);
        System.out.println("  Kalkış: " + kalkisSaati + ", İniş: " + inisSaati);
        System.out.println("  Uçak: " + ucak);
        System.out.println("  Pilot: " + pilot);
        System.out.println("  Yardımcı Pilot: " + yardimciPilot);
    }
}
