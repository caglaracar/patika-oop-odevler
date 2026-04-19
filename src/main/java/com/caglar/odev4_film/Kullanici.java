package com.caglar.odev4_film;

import java.util.ArrayList;
import java.util.List;

public class Kullanici {
    protected String kullaniciAdi;
    protected List<Film> satinAlinanFilmler = new ArrayList<>();

    public Kullanici(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciAdi() { return kullaniciAdi; }

    public void filmSatinAl(Film film) {
        if (!film.isMevcut()) {
            System.out.println("Film mevcut değil: " + film.getAd());
            return;
        }
        satinAlinanFilmler.add(film);
        System.out.println(kullaniciAdi + " filmi satın aldı: " + film.getAd());
    }

    public void filmTalepEt(Film film, FilmSistemi sistem) {
        sistem.filmTalebiEkle(film.getAd(), this);
    }
}
