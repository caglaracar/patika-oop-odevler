# Ödev 2 - Hayvanat Bahçesi Yönetim Sistemi

## Problem
Hayvanat bahçesindeki hayvanlar gruplara ayrılır: Atlar, Kedigiller, Kemirgenler.
Ortak bilgiler: tür adı, ağırlık, yaş.
Her grup için farklı çalışan iki davranış:
- `getDosage()` → ilaç dozajı
- `getFeedSchedule()` → yem verme zamanı

## Sınıflar
- `Hayvan` (abstract) — ortak alanlar + soyut `getDosage()`, `getFeedSchedule()`.
- `At` extends `Hayvan` — kendi doz hesabı ve yem programı.
- `Kedigil` extends `Hayvan` — et ile beslenme, farklı doz oranı.
- `Kemirgen` extends `Hayvan` — küçük porsiyon, düşük doz.
- `HayvanatBahcesi` — hayvan listesini tutar ve rapor üretir.

## OOP Kavramları
- **Polymorphism**: `Hayvan` referansı ile `getDosage()` çağrıldığında alt sınıfın metodu çalışır.
- **Inheritance**: üç grup `Hayvan`'dan türer.
- **Abstraction**: `Hayvan` soyut; her grup kendi mantığını zorunlu olarak yazar.

## Çalıştırma
`Main.java` → farklı hayvanlar eklenir ve `raporYazdir()` çağrılır.
