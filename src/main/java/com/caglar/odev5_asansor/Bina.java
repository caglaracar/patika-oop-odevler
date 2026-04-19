package com.caglar.odev5_asansor;

public class Bina {
    public static final int KAT_SAYISI = 12;
    public static final int ASANSOR_SAYISI = 5;

    private Kat[] katlar;
    private Asansor[] asansorler;

    public Bina() {
        katlar = new Kat[KAT_SAYISI];
        for (int i = 0; i < KAT_SAYISI; i++) {
            katlar[i] = new Kat(i + 1);
        }
        asansorler = new Asansor[ASANSOR_SAYISI];
        for (int i = 0; i < ASANSOR_SAYISI; i++) {
            asansorler[i] = new Asansor(i + 1);
        }
    }

    public Kat[] getKatlar() { return katlar; }
    public Asansor[] getAsansorler() { return asansorler; }

    // Basit programlayıcı: en uygun (en yakın, müsait) asansörü seçer
    public Asansor asansorGorevlendir(int cagriKati) {
        Asansor enYakin = null;
        int enKucukFark = Integer.MAX_VALUE;
        for (Asansor a : asansorler) {
            if (a.isDolu()) continue;
            int fark = Math.abs(a.getMevcutKat() - cagriKati);
            if (fark < enKucukFark) {
                enKucukFark = fark;
                enYakin = a;
            }
        }
        if (enYakin != null) {
            enYakin.katGorevlendir(cagriKati);
            System.out.println("  Programlayıcı: Asansör-" + enYakin.getId() + " kat " + cagriKati + "'e gönderildi.");
        }
        return enYakin;
    }
}
