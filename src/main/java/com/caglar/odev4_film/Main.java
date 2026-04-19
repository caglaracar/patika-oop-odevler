package com.caglar.odev4_film;

public class Main {
    public static void main(String[] args) {
        FilmSistemi sistem = new FilmSistemi();

        Film f1 = new Film("Matrix", "Bilim Kurgu", 1999, 10, 50);
        Film f2 = new Film("Inception", "Bilim Kurgu", 2010, 12, 60);
        Film f3 = new Film("Esaretin Bedeli", "Drama", 1994, 8, 45);
        sistem.filmEkle(f1);
        sistem.filmEkle(f2);
        sistem.filmEkle(f3);

        Kullanici normal = new Kullanici("ahmet");
        Abone abone = new Abone("ayse");
        sistem.kullaniciEkle(normal);
        sistem.kullaniciEkle(abone);

        sistem.filmleriListele();
        sistem.yilaGoreSirala();
        sistem.filmleriListele();

        // normal kullanıcı film satın alabilir
        normal.filmSatinAl(f1);

        // abone önce kredi almalı sonra kiralayabilir
        abone.krediSatinAl(30);
        abone.filmKirala(f2);
        abone.filmSatinAl(f3);

        // mevcut olmayan film talebi
        Film yok = new Film("Interstellar", "Bilim Kurgu", 2014, 15, 70);
        yok.setMevcut(false);
        normal.filmTalepEt(yok, sistem);
    }
}
