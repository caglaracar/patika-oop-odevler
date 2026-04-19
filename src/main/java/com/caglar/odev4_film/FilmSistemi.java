package com.caglar.odev4_film;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FilmSistemi {
    private List<Film> filmler = new ArrayList<>();
    private List<Kullanici> kullanicilar = new ArrayList<>();
    private List<String> filmTalepleri = new ArrayList<>();

    public void filmEkle(Film f) { filmler.add(f); }
    public void kullaniciEkle(Kullanici k) { kullanicilar.add(k); }

    public void filmleriListele() {
        System.out.println("--- Filmler ---");
        for (Film f : filmler) {
            System.out.println("  " + f + " | Kiralama: " + f.getKiralamaKredisi() + " kredi");
        }
    }

    public void yilaGoreSirala() {
        filmler.sort(Comparator.comparingInt(Film::getYil));
        System.out.println("Filmler yıla göre sıralandı.");
    }

    public void filmTalebiEkle(String filmAdi, Kullanici kullanici) {
        filmTalepleri.add(filmAdi + " - talep eden: " + kullanici.getKullaniciAdi());
        System.out.println("Talep alındı: " + filmAdi);
    }

    public List<String> getFilmTalepleri() { return filmTalepleri; }
}
