package com.caglar.odev5_asansor;

import java.util.ArrayList;
import java.util.List;

public class Kat {
    private int katNo;
    private List<Yolcu> bekleyenYolcular = new ArrayList<>();
    private boolean yukariCagri = false;
    private boolean asagiCagri = false;

    public Kat(int katNo) {
        this.katNo = katNo;
    }

    public int getKatNo() { return katNo; }

    public void yukariCagirBas() {
        yukariCagri = true;
        System.out.println("  Kat " + katNo + ": YUKARI çağrı basıldı");
    }

    public void asagiCagirBas() {
        asagiCagri = true;
        System.out.println("  Kat " + katNo + ": AŞAĞI çağrı basıldı");
    }

    public void cagrilariTemizle() {
        yukariCagri = false;
        asagiCagri = false;
    }

    public void yolcuEkle(Yolcu y) {
        bekleyenYolcular.add(y);
    }

    public List<Yolcu> getBekleyenYolcular() { return bekleyenYolcular; }

    public void varisZiliCal(Yon yon) {
        System.out.println("  [ZIL] Kat " + katNo + " - asansör geldi, yön: " + yon);
    }
}
