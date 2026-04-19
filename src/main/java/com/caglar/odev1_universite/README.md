# Ödev 1 - Üniversite Yönetim Sistemi

## Problem
- Üniversitenin sınıflıkları, çalışma ofisleri ve departmanları vardır.
- Departmanlara ait ofisler vardır.
- Üniversitenin çalışanları vardır: profesör veya memur.
- Her çalışan bir ofiste çalışır.

## Sınıflar
- `Universite` — sınıflık, ofis, departman ve çalışanları tutar.
- `Siniflik` — derslik bilgisi (ad, kapasite).
- `Ofis` — çalışma ofisi (no, kat).
- `Departman` — ait olduğu ofisleri tutar.
- `Calisan` (abstract) — ortak ad, soyad, ofis bilgisi.
- `Profesor` extends `Calisan` — bölüm bilgisi, ders verir.
- `Memur` extends `Calisan` — görev bilgisi, idari iş yapar.

## OOP Kavramları
- **Inheritance**: `Profesor` ve `Memur` → `Calisan`.
- **Abstraction**: `Calisan` abstract, `gorevYap()` soyut metot.
- **Composition**: `Universite` birden çok `Departman`, `Ofis`, `Calisan` içerir.

## Çalıştırma
`Main.java` içindeki `main` metodu çalıştırılır.
