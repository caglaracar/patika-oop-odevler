package com.caglar.odev3_ucus;

public class Ucak {
    private String kuyrukNo;
    private String tip;
    private int gerekliPilotSayisi;
    private UcakDurumu durum;

    public Ucak(String kuyrukNo, String tip, int gerekliPilotSayisi) {
        this.kuyrukNo = kuyrukNo;
        this.tip = tip;
        this.gerekliPilotSayisi = gerekliPilotSayisi;
        this.durum = UcakDurumu.CALISIYOR;
    }

    public String getKuyrukNo() { return kuyrukNo; }
    public String getTip() { return tip; }
    public int getGerekliPilotSayisi() { return gerekliPilotSayisi; }
    public UcakDurumu getDurum() { return durum; }

    public void setDurum(UcakDurumu durum) {
        this.durum = durum;
    }

    @Override
    public String toString() {
        return tip + " [" + kuyrukNo + " - " + durum + "]";
    }
}
