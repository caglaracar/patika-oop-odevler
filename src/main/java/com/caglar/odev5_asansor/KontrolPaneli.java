package com.caglar.odev5_asansor;

import java.util.HashSet;
import java.util.Set;

public class KontrolPaneli {
    private Set<Integer> hedefler = new HashSet<>();
    private boolean acilDurum = false;

    public void hedefSec(int kat) {
        hedefler.add(kat);
    }

    public void hedefSil(int kat) {
        hedefler.remove(kat);
    }

    public Set<Integer> getHedefler() {
        return hedefler;
    }

    public void acilDurumBas() {
        acilDurum = true;
        System.out.println("  [!] ACİL DURUM sinyali basıldı!");
    }

    public boolean isAcilDurum() {
        return acilDurum;
    }
}
