package com.caglar.odev5_asansor;

import java.util.ArrayList;
import java.util.List;

public class Asansor {
    public static final int KAPASITE = 6;

    private int id;
    private int mevcutKat;
    private Yon yon;
    private Kapi kapi;
    private KontrolPaneli panel;
    private List<Yolcu> icerdekiler = new ArrayList<>();

    public Asansor(int id) {
        this.id = id;
        this.mevcutKat = 1;
        this.yon = Yon.BEKLIYOR;
        this.kapi = new Kapi();
        this.panel = new KontrolPaneli();
    }

    public int getId() { return id; }
    public int getMevcutKat() { return mevcutKat; }
    public Yon getYon() { return yon; }
    public boolean isDolu() { return icerdekiler.size() >= KAPASITE; }
    public KontrolPaneli getPanel() { return panel; }

    public void katGorevlendir(int hedefKat) {
        panel.hedefSec(hedefKat);
        if (hedefKat > mevcutKat) yon = Yon.YUKARI;
        else if (hedefKat < mevcutKat) yon = Yon.ASAGI;
        else yon = Yon.BEKLIYOR;
    }

    public void hareketEt(Kat[] katlar) {
        if (panel.getHedefler().isEmpty()) {
            yon = Yon.BEKLIYOR;
            return;
        }

        int hedef = panel.getHedefler().iterator().next();
        if (hedef > mevcutKat) {
            mevcutKat++;
            yon = Yon.YUKARI;
        } else if (hedef < mevcutKat) {
            mevcutKat--;
            yon = Yon.ASAGI;
        }

        System.out.println("Asansör-" + id + " şu anda kat " + mevcutKat + " (yön: " + yon + ")");

        if (mevcutKat == hedef) {
            katDur(katlar[mevcutKat - 1]);
            panel.hedefSil(hedef);
        }
    }

    private void katDur(Kat kat) {
        kat.varisZiliCal(yon);
        kapi.ac();
        System.out.println("  Asansör-" + id + " kat " + kat.getKatNo() + "'da kapıları açtı.");

        // inecek yolcuları indir
        icerdekiler.removeIf(y -> {
            if (y.getVarisKati() == kat.getKatNo()) {
                System.out.println("  " + y + " indi.");
                return true;
            }
            return false;
        });

        // bekleyen yolcuları al
        List<Yolcu> alinacaklar = new ArrayList<>();
        for (Yolcu y : kat.getBekleyenYolcular()) {
            if (isDolu()) break;
            icerdekiler.add(y);
            alinacaklar.add(y);
            panel.hedefSec(y.getVarisKati());
            System.out.println("  " + y + " bindi.");
        }
        kat.getBekleyenYolcular().removeAll(alinacaklar);

        kapi.kapat();
        kat.cagrilariTemizle();
    }
}
