package com.caglar.odev4_film;

import java.util.ArrayList;
import java.util.List;

public class Abone extends Kullanici {
    private int kredi;
    private List<Film> kiralananFilmler = new ArrayList<>();

    public Abone(String kullaniciAdi) {
        super(kullaniciAdi);
        this.kredi = 0;
    }

    public int getKredi() { return kredi; }

    public void krediSatinAl(int miktar) {
        this.kredi += miktar;
        System.out.println(kullaniciAdi + " " + miktar + " kredi satın aldı. Toplam: " + kredi);
    }

    public void filmKirala(Film film) {
        if (!film.isMevcut()) {
            System.out.println("Film mevcut değil: " + film.getAd());
            return;
        }
        if (kredi < film.getKiralamaKredisi()) {
            System.out.println("Yetersiz kredi!");
            return;
        }
        kredi -= film.getKiralamaKredisi();
        kiralananFilmler.add(film);
        System.out.println(kullaniciAdi + " filmi kiraladı: " + film.getAd() + " (Kalan kredi: " + kredi + ")");
    }
}
