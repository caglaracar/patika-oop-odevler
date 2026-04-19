package com.caglar.odev5_asansor;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Bina bina = new Bina();
        Saat saat = new Saat();
        Random rnd = new Random(42);

        int yolcuId = 1;
        int simulasyonAdimi = 20;

        for (int t = 0; t < simulasyonAdimi; t++) {
            saat.ilerle();
            System.out.println("\n" + saat.damga() + " --- Tik ---");

            // rastgele yolcu üret (her adımda %60 ihtimalle)
            if (rnd.nextDouble() < 0.6) {
                int kalkis = rnd.nextInt(Bina.KAT_SAYISI) + 1;
                int varis;
                do {
                    varis = rnd.nextInt(Bina.KAT_SAYISI) + 1;
                } while (varis == kalkis);

                Yolcu y = new Yolcu(yolcuId++, kalkis, varis);
                Kat k = bina.getKatlar()[kalkis - 1];
                k.yolcuEkle(y);
                System.out.println("  Yeni yolcu: " + y);

                if (y.istenenYon() == Yon.YUKARI) k.yukariCagirBas();
                else k.asagiCagirBas();

                bina.asansorGorevlendir(kalkis);
            }

            // tüm asansörleri hareket ettir
            for (Asansor a : bina.getAsansorler()) {
                a.hareketEt(bina.getKatlar());
            }
        }

        System.out.println("\nSimülasyon bitti. Toplam tik: " + saat.getTick());
    }
}
